// find even number because % operator is expensive e.g. 7%2=2*(7/2)
// and we know that for every even no first bit is unset. for odd it is set.
public class FindEvenNo {

	public static void main(String[] args) {
		int n = 90;
		if ((n & 1) == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}

	}

}
