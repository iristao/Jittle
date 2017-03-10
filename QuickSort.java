/*****************************************************
 * class QuickSort
 * (skeleton) <<delete this line if untrue>>
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): quicksort partitions the array into two arrays, one with unsorted values larger than the partition and one with unsorted values smaller than the partition. It then recursively splits those arrays until each array has only one element, which would make it sorted. All these arrays are then recombined into one single sorted array. 
 *
 * 2a. Worst pivot choice / array state and associated runtime: the worst pivot post is 0 or arr.length - 1 because it doesn't split the array evenly and therefore one array must perform more sorts than the other array
 *
 * 2b. Best pivot choice / array state and associated runtime: the best pivot choice is arr.length / 2  because it splits the array into halves that can be then partitioned equally, thereby splitting the work equally 
 *
 * 3. Approach to handling duplicate values in array: it works out naturally. the duplicate is simply put in the next index over since the comparison is <  
 *
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
	qhelper(d, 0, d.length -1, (d.length -1) / 2 );
	//	qhelper(d, 0, d.length -1, d.length-1 );
	//qhelper(d, 0, d.length -1, 0 );

    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helpermethods here.



    public static void qhelper(int[] arr, int left, int right, int pvtPos){
	if (left < right){
	    pvtPos = partition(arr, left, right, pvtPos);
	    qhelper(arr, left, pvtPos -1, pvtPos - 1);
	    qhelper(arr, pvtPos +1, right, pvtPos + 1);
	}
    }
    

    
    public static int partition(int [] arr, int lb, int ub, int pivot){
	// lb = lower bound, ub = upper bound

	int pvtVal = arr[pivot];
	swap(ub, pivot, arr);
	int s = lb;
	for (int i = lb; i < ub; i++){
	    if (arr[i] <= pvtVal) {
		swap(s, i, arr);
		s++;
	    }
	}
        swap(ub, s, arr);
	//printArray(arr);
	//System.out.println(" Returns: "+ s +"\n"); //prints final value of s
	return s;
    }

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



	//==========================================================
	double timing = 0.00;
	
        double begin = System.nanoTime();
	qsort( arrN );
        double end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;

	begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;

	begin = System.nanoTime();
	qsort( arrN );
	end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;

	begin = System.nanoTime();
	qsort( arrN );
	end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;

	begin = System.nanoTime();
	qsort( arrN );
	end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin)/1000.0;
	
	


	System.out.println(timing/10.0);//--->> it gets too large. what's wrong with the above code?

	System.out.println("=====================");



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



	//===========================TIME========================


    }//end main

}//end class QuickSort
