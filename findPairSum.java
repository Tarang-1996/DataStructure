public class findPairSum {
	public static void findPair(int arr[], int t) {

		int start = 0, end = arr.length - 1;
		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == t) {
				System.out.println(arr[start] + "," + arr[end]);
				break;
			} else if (sum > t) {
				end--;

			} else {
				start++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 5, 8, 9 };
		int t = 13;
		findPair(arr, t);

	}

}
