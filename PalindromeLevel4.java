
public class PalindromeLevel4 {
	static boolean isValid(char x){
		if(x>=97 && x<=122){
			return true;
		}
		return false;
	}

	private static boolean isPalindrome(char[] arr) {
		int start=0;
		 int end=arr.length-1;
		// TODO Auto-generated method stub
		 while(start<end){
		 
		if(isValid(arr[start])){
			if(isValid(arr[end])){
				if((arr[start]^arr[end])==0){
					
					start++;
					end--;
				}
				else{
					return false;
					
				}
			}else{
				end--;
			}
		 }else{
			 start++;
		 }
	}
		 return true;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr={'@','a','b','&','d','*','c','b','a'};
		if(isPalindrome(arr)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}

	
}
