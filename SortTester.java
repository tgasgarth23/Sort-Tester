public class SortTester {
    
    public static void main(String[] args) {
		/*
		for (int n = 1; n <= 1_000; n += 10){

			System.out.println(n);
		}

		System.out.println("\n\nsize\tquickSort\n\n");
		
		for (int n = 1; n <= 1_000; n += 10){

	    	System.out.println(runMergeSortImprovTest(n, 10000));
		}
		*/
		System.out.println(runMergeSortImprovTest(20, 1));

    }

    // Test the running times of insertion on random arrays of a given
    // size. Several (numTests) arrays are generated and sorted, and
    // the average running time of Sorting.insertionSort is returned.
    public static long runQuickSortTest(int size, int numTests) {
		long totalTime = 0;
		long start, stop;

		for (int i = 0; i < numTests; i++) {
	    	int[] a = Sorting.init(size);
	    	Sorting.shuffle(a);

	    	start = System.nanoTime();
	    	Sorting.quickSort(a);
	    	stop = System.nanoTime();

	    	if (!Sorting.isSorted(a))
			System.out.println("Failed sorting task!");

	    	totalTime += (stop - start);
		}

		return totalTime / numTests;
    }    

	public static long runMergeSortTest(int size, int numTests) {
		long totalTime = 0;
		long start, stop;
	
		for (int i = 0; i < numTests; i++) {
			int[] a = Sorting.init(size);
			Sorting.shuffle(a);
	
			start = System.nanoTime();
			Sorting.mergeSort(a);
			stop = System.nanoTime();
	
			if (!Sorting.isSorted(a))
			System.out.println("Failed sorting task!");
	
			totalTime += (stop - start);
		}
	
		return totalTime / numTests;
	}

	public static long runMergeSortImprovTest(int size, int numTests) {
		long totalTime = 0;
		long start, stop;
	
		for (int i = 0; i < numTests; i++) {
			int[] a = Sorting.init(size);
			Sorting.shuffle(a);
	
			start = System.nanoTime();
			Sorting.mergeSortImprov(a);
			stop = System.nanoTime();
	
			if (!Sorting.isSorted(a))
			System.out.println("Failed sorting task!");
	
			totalTime += (stop - start);
		}
	
		return totalTime / numTests;
	}


	public static long runInsertionSortTest(int size, int numTests) {
		long totalTime = 0;
		long start, stop;
	
		for (int i = 0; i < numTests; i++) {
			int[] a = Sorting.init(size);
			Sorting.shuffle(a);
	
			start = System.nanoTime();
			Sorting.insertionSort(a);
			stop = System.nanoTime();
	
			if (!Sorting.isSorted(a))
			System.out.println("Failed sorting task!");
	
			totalTime += (stop - start);
		}
	
		return totalTime / numTests;
		}     
	

}
