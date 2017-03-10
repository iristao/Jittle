public class QuickSortTester{
    /*
      Our timing mechanism uses System.nanoTime(). It is run once at the very beginning of the test and once at the end, after running the qsort method on an array. We then subtract the time taken at the end with the time taken at the start, to find the time spent on the qsort method. 
     */
    
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
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);

	begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);

        begin = System.nanoTime();
	qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);

	begin = System.nanoTime();
	qsort( arrN );
	end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);

	begin = System.nanoTime();
	qsort( arrN );
	end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);

	begin = System.nanoTime();
	qsort( arrN );
	end = System.nanoTime();
	System.out.println("arrN after sort: " );
	printArr(arrN);
	timing += (end-begin);


	System.out.println(timing);//--->> it gets too large. what's wrong with the above code?

	System.out.println("=====================");
    }
    

}
