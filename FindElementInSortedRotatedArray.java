public class FindElementInSortedRotatedArray {

	public static int findMax(int[] arr, int start, int end) {
		if (start > end)
			return -1;// {

		if (end == start)
			return end;

		int mid = start + (end - start) / 2;

		if (mid < end && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (mid > start && arr[mid - 1] > arr[mid]) {
			return mid - 1;
		}

		if (arr[start] >= arr[mid]) {
			return findMax(arr, start, mid - 1);
		}

		return findMax(arr, mid + 1, end);
		/*
		 * if (mid != 0 && mid != end && arr[mid] > arr[mid + 1] && arr[mid] >
		 * arr[mid - 1]) { max = mid; } else if (mid > 0 && arr[mid] < arr[mid -
		 * 1]) { max = mid - 1;
		 * 
		 * } else if (mid < end && arr[mid] < arr[mid + 1]) { max = mid + 1; }
		 * else if (arr[mid - 1] < arr[mid]) { end = mid - 1; }
		 */
		// return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 1, 2, 3, 4 };
		// int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 4;
		int start = 0, end = arr.length - 1;
		int max = findMax(arr, start, end);
		System.out.println("pivot : " + max);

		if (arr[max] == target) {
			System.out.println(max);
		} else if (arr[start] <= target /* && arr[start] <= target */) {
			end = max - 1;
			System.out.println(findTarget(arr, target, start, end));
		} else {
			start = max + 1;
			System.out.println(findTarget(arr, target, start, end));
		}

	}

	private static int findTarget(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
				
			} else if (mid > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

}
