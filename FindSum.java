
public class FindSum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,5,6,7,8,3,9,4,2,3,6,9,7,5,4,1,2,3,6,9,7,1};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"="+(sum-arr[i]));
		}

	}

}
