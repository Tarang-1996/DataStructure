
public class Palindrome {
	private static boolean isPalindrome(int[] arr) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		while(start<end){
			if(arr[start]!=arr[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={'a','b','c','d','c','b','a'};
		if(isPalindrome(arr)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}

	

}
