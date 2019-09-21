//find first set bit in a number.
public class FindFirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int bit = n & (~(n - 1));
		System.out.println(bit);

	}

}
