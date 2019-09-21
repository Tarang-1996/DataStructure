// Find the Occurence of target character in the given array
public class OccurenceOfCharacter {
	public static int getCount(int[] arr1, int target) {
		int first = firstOccurrence(arr1, target);
		int last = lastOccurence(arr1, target);
		System.out.println(first + "=" + last);
		if (first == -1 && last == -1) {
			return 0;
		} else {
			return last - first + 1;
		}
	}

	public static int firstOccurrence(int arr[], int t) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == t) {
				if (mid == 0 || arr[mid - 1] < t) {
					return mid;
				}
				end = mid - 1;
			} else if (arr[mid] < t) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static int lastOccurence(int arr[], int t) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == t) {
				if (mid == arr.length || arr[mid + 1] > t) {
					return mid;
				}
				start = mid + 1;
			} else if (arr[mid] < t) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 0 };
		MergeSort.split(arr, 0, arr.length - 1);
		int result = getCount(arr, 0);
		if (result != 0) {
			System.out.print("occurence=" + result);
		} else {
			System.out.println("Not Find");
		}
	}

}
