// find common elements in two sorted  array 
public class CommonElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		int brr[]={7,8,9,10};
		int target;
		target=arr[0]<brr[0]?brr[0]:arr[0];
		int last=arr[arr.length-1]>brr[brr.length-1]?brr[brr.length-1]:arr[arr.length-1];
		System.out.println(target+" "+last);
		if(last<target){
			System.out.println("No common element ");
		}
		else{
		for(int i=target;i<=last;i++){
			System.out.println(i);
			}
		}
	}

}
