//Find the Unique Element in the array
public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,5,3,2};
		int result=0;
		for(int i=0;i<arr.length;i++){
			result=result^arr[i];
		}
		System.out.println(result);
	}

}
