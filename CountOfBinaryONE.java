// count of no of 1's in binary form of a number
public class CountOfBinaryONE {

	
	public static void main(String[] args) {
		int n=10,count=0;
		while(n>0){
			n=n&(n-1);
			count++;
			
		}
		System.out.println("Number of 1's in given="+count);

	}

}
