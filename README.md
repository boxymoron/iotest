
# IOTest

## Sequential IO Read/Write tests

A simple sequential IO test with different buffer sizes.

To run:

*   `javac src/main/java/IOTest.java`
*   `java -cp src/main/java IOTest`

Output looks like this:

<pre>

Starting sequential write test... 

Writing 60 MB with bufferSize: 1 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 4,420,369.06 IOPS
Elapsed: 0.14 sec; 1.07 MB written ; 7.66 secs to go;  7.69 MB/sec ; 8,234.93 IOPS
...
Elapsed: 3.60 sec; 60.00 MB written ; 0.00 secs to go;  16.67 MB/sec ; 23,503.17 IOPS
Writing 120 MB with bufferSize: 2 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 6,797,264.78 IOPS
Elapsed: 0.04 sec; 1.95 MB written ; 2.68 secs to go;  43.98 MB/sec ; 22,844.05 IOPS
Elapsed: 3.04 sec; 120.00 MB written ; 0.00 secs to go;  39.43 MB/sec ; 43,280.20 IOPS
Writing 180 MB with bufferSize: 4 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 8,956,204.16 IOPS
Elapsed: 0.04 sec; 3.52 MB written ; 2.21 secs to go;  79.83 MB/sec ; 20,545.69 IOPS
...
Elapsed: 2.73 sec; 180.00 MB written ; 0.00 secs to go;  65.96 MB/sec ; 96,468.48 IOPS
Writing 240 MB with bufferSize: 8 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 9,011,140.02 IOPS
Elapsed: 0.04 sec; 6.25 MB written ; 1.50 secs to go;  156.20 MB/sec ; 20,072.89 IOPS
...
Elapsed: 1.73 sec; 239.99 MB written ; 0.00 secs to go;  139.01 MB/sec ; 34,647.47 IOPS
Writing 300 MB with bufferSize: 16 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 7,789,028.60 IOPS
Elapsed: 0.05 sec; 10.94 MB written ; 1.22 secs to go;  237.56 MB/sec ; 15,272.24 IOPS
...
Elapsed: 1.36 sec; 299.98 MB written ; 0.00 secs to go;  220.42 MB/sec ; 35,201.67 IOPS
Writing 360 MB with bufferSize: 32 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 5,752,416.01 IOPS
Elapsed: 0.05 sec; 18.75 MB written ; 0.98 secs to go;  349.51 MB/sec ; 11,230.89 IOPS
...
Elapsed: 1.15 sec; 359.97 MB written ; 0.00 secs to go;  312.09 MB/sec ; 35,887.09 IOPS
Writing 420 MB with bufferSize: 64 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 1,946,850.97 IOPS
...
Elapsed: 0.95 sec; 419.94 MB written ; 0.00 secs to go;  442.14 MB/sec ; 16,424.65 IOPS
Writing 480 MB with bufferSize: 128 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 1,770,663.64 IOPS
Elapsed: 0.08 sec; 50.00 MB written ; 0.73 secs to go;  592.46 MB/sec ; 4,760.71 IOPS
...
Elapsed: 0.73 sec; 479.88 MB written ; 0.00 secs to go;  655.77 MB/sec ; 7,217.09 IOPS
Writing 540 MB with bufferSize: 256 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 702,332.68 IOPS
...
Elapsed: 0.78 sec; 539.75 MB written ; 0.00 secs to go;  689.58 MB/sec ; 11,871.25 IOPS
Writing 600 MB with bufferSize: 512 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 120,917.67 IOPS
...
Elapsed: 0.79 sec; 599.50 MB written ; 0.00 secs to go;  757.27 MB/sec ; 1,380.69 IOPS
Writing 660 MB with bufferSize: 1,024 KB
Elapsed: 0.00 sec; 0.00 MB written ; Infinity secs to go;  0.00 MB/sec ; 38,301.56 IOPS
Elapsed: 0.22 sec; 100.00 MB written ; 1.24 secs to go;  451.86 MB/sec ; 457.60 IOPS
...
Elapsed: 1.11 sec; 659.00 MB written ; 0.00 secs to go;  593.67 MB/sec ; 745.08 IOPS
Finished tests. Exiting...
Starting sequential read test... 

Reading 60 MB with bufferSize: 1 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 231,096.61 IOPS ; currentPosition: 1,024
Elapsed: 0.01 sec; 1.07 MB read ; 0.71 secs to go;  82.59 MB/sec ; 136,533.48 IOPS ; currentPosition: 1,127,424
...
Elapsed: 0.12 sec; 60.00 MB read ; 0.00 secs to go;  491.95 MB/sec ; 1,380,787.22 IOPS ; currentPosition: 62,914,560
Reading 120 MB with bufferSize: 2 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 5,833,522.92 IOPS ; currentPosition: 2,048
Elapsed: 0.00 sec; 1.95 MB read ; 0.11 secs to go;  1,033.35 MB/sec ; 617,591.60 IOPS ; currentPosition: 2,050,048
...
Elapsed: 0.21 sec; 120.00 MB read ; 0.00 secs to go;  584.16 MB/sec ; 1,193,005.65 IOPS ; currentPosition: 125,829,120
Reading 180 MB with bufferSize: 4 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 1,378,309.09 IOPS ; currentPosition: 4,096
Elapsed: 0.00 sec; 3.52 MB read ; 0.15 secs to go;  1,196.74 MB/sec ; 425,243.39 IOPS ; currentPosition: 3,690,496
...
Elapsed: 0.11 sec; 180.00 MB read ; 0.00 secs to go;  1,696.99 MB/sec ; 2,495,480.41 IOPS ; currentPosition: 188,743,680
Reading 240 MB with bufferSize: 8 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 14,347,459.60 IOPS ; currentPosition: 8,192
Elapsed: 0.00 sec; 6.25 MB read ; 0.11 secs to go;  2,211.99 MB/sec ; 297,690.04 IOPS ; currentPosition: 6,561,792
...
Elapsed: 0.10 sec; 239.99 MB read ; 0.00 secs to go;  2,322.77 MB/sec ; 884,385.40 IOPS ; currentPosition: 251,658,240
Reading 300 MB with bufferSize: 16 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 15,635,470.18 IOPS ; currentPosition: 16,384
Elapsed: 0.00 sec; 10.94 MB read ; 0.10 secs to go;  3,003.41 MB/sec ; 199,523.54 IOPS ; currentPosition: 11,485,184
...
Elapsed: 0.10 sec; 299.98 MB read ; 0.00 secs to go;  3,136.77 MB/sec ; 409,440.53 IOPS ; currentPosition: 314,572,800
Reading 360 MB with bufferSize: 32 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 6,302,984.46 IOPS ; currentPosition: 32,768
Elapsed: 0.01 sec; 18.75 MB read ; 0.19 secs to go;  1,817.36 MB/sec ; 59,752.26 IOPS ; currentPosition: 19,693,568
...
Elapsed: 0.16 sec; 359.97 MB read ; 0.00 secs to go;  2,206.78 MB/sec ; 282,713.75 IOPS ; currentPosition: 377,487,360
Reading 420 MB with bufferSize: 64 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 5,709,587.54 IOPS ; currentPosition: 65,536
Elapsed: 0.01 sec; 31.25 MB read ; 0.18 secs to go;  2,143.96 MB/sec ; 34,719.25 IOPS ; currentPosition: 32,833,536
...
Elapsed: 0.18 sec; 419.94 MB read ; 0.00 secs to go;  2,360.91 MB/sec ; 89,930.29 IOPS ; currentPosition: 440,401,920
Reading 480 MB with bufferSize: 128 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 4,877,989.29 IOPS ; currentPosition: 131,072
...
Elapsed: 0.14 sec; 479.88 MB read ; 0.00 secs to go;  3,363.88 MB/sec ; 49,272.96 IOPS ; currentPosition: 503,316,480
Reading 540 MB with bufferSize: 256 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 1,582,395.32 IOPS ; currentPosition: 262,144
...
Elapsed: 0.17 sec; 539.75 MB read ; 0.00 secs to go;  3,163.63 MB/sec ; 54,851.40 IOPS ; currentPosition: 566,231,040
Reading 600 MB with bufferSize: 512 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 284,051.37 IOPS ; currentPosition: 524,288
...
Elapsed: 0.19 sec; 599.50 MB read ; 0.00 secs to go;  3,089.56 MB/sec ; 6,430.08 IOPS ; currentPosition: 629,145,600
Reading 660 MB with bufferSize: 1,024 KB
Elapsed: 0.00 sec; 0.00 MB read ; Infinity secs to go;  0.00 MB/sec ; 167,234.15 IOPS ; currentPosition: 1,048,576
...
Elapsed: 0.22 sec; 659.00 MB read ; 0.00 secs to go;  3,051.84 MB/sec ; 5,022.31 IOPS ; currentPosition: 692,060,160
Finished tests. Exiting...

</pre>