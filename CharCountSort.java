
public class CharCountSort {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr={'a','a','b','b','c','d','z','x','A','C','S'};
		int counter[]=new int[256];
		for(int j=0;j<arr.length;j++){
			counter[arr[j]]++;
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"="+counter[arr[i]]);
		}
	}

}
