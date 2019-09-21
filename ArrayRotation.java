
public class ArrayRotation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		int d=3;
		int [] brr=new int[d];
		for(int i=0;i<d;i++){
			brr[i]=arr[i];
		}
		int k=0;
		for(int j=d;j<arr.length && k<arr.length;j++){
			
			arr[k++]=arr[j];
//			System.out.print(arr[k]+" ");
		}
		
//		for(int t=0;t<arr.length;t++){
//			System.out.print(arr[t]);
//		}
//		System.out.println();
		int h=0;
		for(int l=arr.length-d;l<arr.length && h<brr.length;l++){
			arr[l]=brr[h++];
		}
		for(int t=0;t<arr.length;t++){
			System.out.print(arr[t]);
		}

	}

}
