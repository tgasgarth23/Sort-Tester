public class SortTester {
    
    public static void main(String[] args) {
		for (int n = 10_000; n <= 1_000_000; n += 10_000){

			System.out.println(n);
		}

		System.out.println("size\tquickSort");
	

		for (int n = 10_000; n <= 1_000_000; n += 10_000){

	    	System.out.println(runQuickSortTest(n, 25));
		}

		System.out.println("\nsize\tmergeSort");
		for (int n = 10_000; n <= 1_000_000; n += 10_000){

			System.out.println(runMergeSortTest(n, 25));
		}

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

}
