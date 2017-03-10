public class QuickSortTester{
    /*
      Our timing mechanism uses System.nanoTime(). It is run once at the very beginning of the test and once at the end, after running the qsort method on an array. We then subtract the time taken at the end with the time taken at the start, to find the time spent on the qsort method alone. This avoids taking into account the time spent generating the array as well as the initial java warm up. The time found for each test case is then added together and divided by the number of tests to find the average.
     */
    
    //main method for testing
    public static void main( String[] args ) 
    {

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	QuickSort.printArr(arrN);

       	QuickSort.shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	QuickSort.printArr(arrN);


	//==========================================================
	double timing = 0.00;
	
        double begin = System.nanoTime();
	QuickSort.qsort( arrN );
        double end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

	
        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);

        begin = System.nanoTime();
	QuickSort.qsort( arrN );
        end = System.nanoTime();
	System.out.println("arrN after sort: " );
	QuickSort.printArr(arrN);
	timing += (end-begin);
	//System.out.println( (end-begin)/1000.0);



	
	System.out.println(timing/10);//--->> it gets too large. what's wrong with the above code?

	System.out.println("=====================");
    }
    

}
