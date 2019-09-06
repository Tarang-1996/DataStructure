
public class PalindromeLevel3 {
	 static boolean isValid(char x, char y){
		if((x^y) == 0 || (x^(y^32))==0){
			return true;
		}
		return false;
	}
	 static boolean isPalindrome(char[] arr) {
		 int start=0;
		 int end=arr.length-1;
		// TODO Auto-generated method stub
		 while(start<end){
		 
		if(isValid(arr[start],arr[end])){
			start++;
			end--;
		}else{
			return false;
		}
		 }
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr={'a','b','2','c','2','B','A'};
		if(isPalindrome(arr)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
	
}
