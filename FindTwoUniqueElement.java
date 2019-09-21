public class FindTwoUniqueElement {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 5, 6, 5, 2, 4, 8 };
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor ^= arr[i];

		}
		System.out.println(xor);
		int flag = xor & (~(xor - 1));
		System.out.println(flag);
		int num1 = 0, num2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] ^ flag) != 0) {
				num1 ^= arr[i];
			} else {
				num2 ^= arr[i];
			}

		}
		System.out.println("num1="+num1+" num2="+num2);
	}
	

}
