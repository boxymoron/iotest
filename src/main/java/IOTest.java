import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class IOTest {

	private static final int MEGABYTE = 1024*1024;

	private static final String TEST_FILE = "./iotest.txt";

	private static final int TOTAL_BYTES = MEGABYTE*60;
	
	private static boolean SYNC = true;

	public static void main(String[] args) throws FileNotFoundException{
		ExecutorService executor = Executors.newCachedThreadPool();
		System.out.println("Starting sequential write test... ");
		//executor.execute(
				new Runnable(){
				@Override
				public void run() {
					
						try(RandomAccessFile raf = new RandomAccessFile(new File(TEST_FILE), "rws")) {
							FileDescriptor fd = raf.getFD();
							int count = 1;
							for(final AtomicInteger bufferSize = new AtomicInteger(1024); bufferSize.get() <= MEGABYTE; bufferSize.set(bufferSize.get()*2)){
								byte[] bytearr = new byte[bufferSize.get()];
								int writeSize = count*TOTAL_BYTES/bufferSize.get();
								int TOTAL_MB = count*(TOTAL_BYTES/MEGABYTE);
								System.out.printf("\nWriting %,d MB with bufferSize: %,d KB\n",TOTAL_MB , bufferSize.get()/1024);
								new Random().nextBytes(bytearr);
								long startNanos = System.nanoTime();
								long tempNanos = System.nanoTime();
								for(int i=0; i< writeSize ; i++){
									raf.write(bytearr);
									if(i == writeSize -1 && SYNC){
										fd.sync();
									}
									//System.out.println(System.nanoTime()-startNanos);
									if(i == writeSize-1 || i % (1200 - (count * 100)) == 0){//keep it steady
									//if(i%10 == 0){	
										double deltaSec = ((double)System.nanoTime()-startNanos)/((double)1000000000);
										double mbSec = (((double)bufferSize.get()*i))/deltaSec/MEGABYTE;
										double mbWriten = ((double)i)*((double)bufferSize.get())/(1024d*1024d);
										double secsToGo = (((double)TOTAL_MB)-mbWriten)/(mbSec);
										double IOPS = ((1200d - ((double)count * 100d)))/(((double)System.nanoTime()-tempNanos)/((double)1000000000));
										System.out.printf("Elapsed: %,.2f sec; %,.2f MB written ; %,.2f secs to go;  %,.2f MB/sec ; %,.2f IOPS\r",deltaSec, mbWriten, secsToGo, mbSec, IOPS);
										tempNanos = System.nanoTime();
									}
								}
								count++;
								raf.seek(0);
							}
							System.out.println("\nFinished tests. Exiting...");
							//System.exit(0);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				}	};
		//});
			
			System.out.println("Starting sequential read test... ");
			executor.execute(new Runnable(){
				@Override
				public void run() {
					
						try(RandomAccessFile raf = new RandomAccessFile(new File(TEST_FILE), "rws")) {
							FileDescriptor fd = raf.getFD();
							FileChannel inChannel = raf.getChannel();
						    
							int count = 1;
							for(final AtomicInteger bufferSize = new AtomicInteger(1024); bufferSize.get() <= MEGABYTE; bufferSize.set(bufferSize.get()*2)){
								ByteBuffer buffer = ByteBuffer.allocate(bufferSize.get());
								int writeSize = count*TOTAL_BYTES/bufferSize.get();
								int TOTAL_MB = count*(TOTAL_BYTES/MEGABYTE);
								System.out.printf("\nReading %,d MB with bufferSize: %,d KB\n",TOTAL_MB , bufferSize.get()/1024);
								//new Random().nextBytes(bytearr);
								long startNanos = System.nanoTime();
								long tempNanos = System.nanoTime();
								for(int i=0; i< writeSize ; i++){
									//raf.seek(i*bufferSize.get());
									int bytesRead = inChannel.read(buffer);//raf.read(bytearr);
									buffer.flip();
									//fd.sync();
									if(bytesRead <= 0){
										System.out.println("\nReached end of test: "+bytesRead);
									}
									//System.out.println(System.nanoTime()-startNanos);
									if(i == writeSize-1 || i % (1200 - (count * 100)) == 0){//keep it steady
										double deltaSec = ((double)System.nanoTime()-startNanos)/((double)1000000000);
										double mbSec = (((double)bufferSize.get()*i))/deltaSec/MEGABYTE;
										double mbWriten = ((double)i)*((double)bufferSize.get())/(1024d*1024d);
										double secsToGo = (((double)TOTAL_MB)-mbWriten)/(mbSec);
										double IOPS = ((1200d - ((double)count * 100d)))/(((double)System.nanoTime()-tempNanos)/((double)1000000000));
										System.out.printf("Elapsed: %,.2f sec; %,.2f MB read ; %,.2f secs to go;  %,.2f MB/sec ; %,.2f IOPS ; currentPosition: %,d\r",deltaSec, mbWriten, secsToGo, mbSec, IOPS, raf.getFilePointer());
										tempNanos = System.nanoTime();
										
									}
								}
								count++;
								raf.seek(0);
							}
							System.out.println("\nFinished tests. Exiting...");
							System.exit(0);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				}
			});
		
	}
}
