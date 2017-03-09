/*Dasha Shifrina
APCS2 pd3
HW#15: So So Quick
2017-03-08
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): The middle value of the range of the array that is being sorted is placed in its correct position, creating a partition. Then, the two regions on the side of the partition have the middle value placed in its correct position. This keeps going, breaking up the array in two regions every time, until the range of the unsorted region is 0. 
 *
 * 2a. Worst pivot choice / array state and associated runtime: 
 *If the pivot is at index 0. That would essentially not be splitting the array in half at all, because one array would have no elements and another would still have n-1 amount.
 * 2b. Best pivot choice / array state and associated runtime:
 *If the pivot is exactly in the middle because that creates 2 arrays of the same size, essentially splitting the array perfectly in half. 
 * 3. Approach to handling duplicate values in array:
 * Since the array always splits in two with every recursion, my algo works fine with duplicates although when it splits, one array has no elements and another has n-1 elements.
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/
public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    {
	qsort(d, 0, d.length-1);
    }

    public static void qsort(int[] d, int left, int right){
	if(left < right){
	    int  pvtPos = partition(d, left, right, (left + right)/2);
	    qsort(d, left, pvtPos-1);
	    qsort(d, pvtPos + 1, right);
	}
    }

    public static int partition(int[] arr, int lb, int ub, int pivot){
	int v = arr[pivot];
	swap(ub,pivot,arr);
	int s = lb;
	for(int i = lb; i < ub; i++){
	    if(arr[i] < v){
		swap(s,i,arr);
		s++;
	    }
	}
	swap(ub,s,arr);
	return s;
    }
    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.


    //main method for testing
    public static void main( String[] args ) 
    {
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);
	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
		/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

		  
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
