public class E03_SelectionSortTest {

	public static void main(String[] args) {

		int[] arr = { 102, 34, 2, 56, 7, 67, 88, 42, 90, 81, 22, 34, 33, 44, 1231 };
		SelectionSort sorter = new SelectionSort();
		sorter.sort(arr);

		System.out.println("Sorted Array:");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

}