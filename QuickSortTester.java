public class QuickSortTester 
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
 	QuickSort bob = new QuickSort();
 
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
 	
 	System.out.println("Quick Sort:");
 	long average = 0;
 	
 	for (int x = 0; x < 1000; x++){
 	    long start = System.nanoTime();
 	    bob.qsort(arr0);
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
 	    bob.qsort(arr1);
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
 	    bob.qsort(arr2);
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
 	    bob.qsort(arr3);
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
 	    bob.qsort(arr4);
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
 	    bob.qsort(arr5);
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
 	    bob.qsort(arr6);
 	    long end = System.nanoTime();
 	    long elapsed = end - start;
 	    average += elapsed;
 	    //System.out.println(elapsed);
	    }
	average = average / 1000;
 	System.out.println("1,000,000 elements: \t" + average);
 
   }//end main
 
 }//end class
