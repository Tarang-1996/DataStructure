 // it is countSort not Bucket
public class BucketSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1};
		int brr[]={0,0,0};
		int j=0,k=0;
		for(int i=0;i<arr.length;i++){
			brr[arr[i]]++;
		}
		
		while(j<brr.length && k<arr.length ){
			for(int h=0;h<brr[j];h++){
				arr[k++]=j;
			}
			j++;
		}
		for(int d=0;d<arr.length;d++){
			System.out.print(arr[d]+" ");
		}
	}

}
