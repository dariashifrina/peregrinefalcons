//Team Last -- Queenie Xiang, Henry Zheng, Rihui Zheng
//APCS2 pd3
//HW07 -- What Does the Data Say?
//2017-02-15

/*======================================
  class MergeSortTester
  ALGORITHM:
  Make integer arrays containing different numbers of elements and find the runtime in nanoseconds it takes to sort these arrays with MergeSort.
  
  BIG-OH CLASSIFICATION OF ALGORITHM:
  nlog(n)
  
  Mean execution times for dataset of size n:
  Batch size: <1000>
  n=1       time:206
  n=10      time: 11441
  n=100     time: 40570
  n=1000    time: 307898
  n=10000   time: 3036661
  n=100000  time: 33497709
  n=1000000 time: 378249087

  ANALYSIS:
  After going through the execution times for various size datasets and graphing them, along with a "line of best fit", we conclude that the Big-Oh classification of MergeSort is nlog(n). According to our graph, the "line of best fit" was something along the lines of y=xlog(x). We hypothesized that this was true because the log(x) portion is the log base 2 of n of the splitting the deck in half algorithm and the scalar multiple coefficient of x is the scalar multiple of n of the number of times you have to sort.
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     *  We populated arrays with random ints on multiples of 10. 
     *  We then sorted each one and calculated the time before and after the sort 1000 times.
     *  We divided that time by 1000 to find the average amount of time it took for sort.
     *  We realized that a few outliers will not skew the data a lot due to having a good cushion number of 1000 tests for each array size.
     ******************************/
    public static void main( String[] args ) 
    {
	MergeSort bob = new MergeSort();

	/*
	  =======================
	  Start of array creation
	  =======================
	*/	

	//create array of length 1
	int[] arr0 = new int[1];
	for(int i = 0;i < 1; i++){
	    arr0[i] = (int)(Math.random()*1000);
	}

	//create array of length 10
	int[] arr1 = new int[10];
	for(int i = 0;i < 10; i++){
	    arr1[i] = (int)(Math.random()*1000);
	}

	//create array of length 100
	int[] arr2 = new int[100];
	for(int i = 0;i < 100; i++){
	    arr2[i] = (int)(Math.random()*1000);
	}

	//create array of length 1000
	int[] arr3 = new int[1000];
	for(int i = 0;i < 1000; i++){
	    arr3[i] = (int)(Math.random()*1000);
	}

	//create array of length 10000
	int[] arr4 = new int[10000];
	for(int i = 0;i < 10000; i++){
	    arr4[i] = (int)(Math.random()*1000);
	}

	//create array of length 100000
	int[] arr5 = new int[100000];
	for(int i = 0;i < 100000; i++){
	    arr5[i] = (int)(Math.random()*1000);
	}

	//create array of length 1000000
	int[] arr6 = new int[1000000];
	for(int i = 0;i < 1000000; i++){
	    arr6[i] = (int)(Math.random()*1000);
	}

	
	/*
	  =======================
	  Start of time testing
	  =======================
	*/
	
	System.out.println("Merge Sort:");
	long average = 0;
	
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr0);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("1 element: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr1);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("10 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr2);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("100 elements: \t\t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr3);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("1,000 elements: \t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr4);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("10,000 elements: \t" + average);

	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr5);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("100,000 elements: \t" + average);

	
	average = 0;
	for (int x = 0; x < 1000; x++){
	    long start = System.nanoTime();
	    bob.sort(arr6);
	    long end = System.nanoTime();
	    long elapsed = end - start;
	    average += elapsed;
	    //System.out.println(elapsed);
	    }
	average = average / 1000;
	System.out.println("1,000,000 elements: \t" + average);
	
	
    }//end main

}//end class
