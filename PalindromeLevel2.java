
public class PalindromeLevel2 {
	public static int absolute(int i){
		if(i<0){
			return i;
		}
		return i;
	}
	private static boolean isPalindrome(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end){
			int diff=arr[start]-arr[end];
			
			if(diff!=0 && diff!=32){
				
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={'a','b','c','B','A'};
		if(isPalindrome(arr)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

	
}
