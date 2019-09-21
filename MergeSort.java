public class MergeSort {
	public static void split(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		split(arr, start, mid);
		split(arr, mid + 1, end);
		merge(arr, start, mid, end);

	}

	public static void merge(int arr[], int start, int mid, int end) {
		int l1 = mid - start + 1;
		int l2 = end - mid;
		int L[] = new int[l1];
		int R[] = new int[l2];
		int i, j;
		for (i = 0; i < l1; i++) {
			L[i] = arr[start + i];
		}
		for (j = 0; j < l2; j++) {
			R[j] = arr[mid + 1 + j];
		}

		i = 0;
		j = 0;
		int k = start;
		
		while (i < l1 && j < l2) {
			if (L[i] < R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}
		while (i < l1) {
			arr[k++] = L[i++];
		}
		while (j < l2) {
			arr[k++] = R[j++];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 9, 8, 7, 6, 5, 4, 1, 10 };
		split(arr, 0, arr.length - 1);
		for (int h = 0; h < arr.length; h++) {
			System.out.print(arr[h] + " ");
		}
		System.out.println();
	}

}
