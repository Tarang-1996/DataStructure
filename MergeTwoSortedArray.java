// merge two sorted array
public class MergeTwoSortedArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		int brr[]={6,7,8,9};
		int i = 0,j = 0;
		int k=0;
		int crr[]=new int[arr.length+brr.length];
		while( i<arr.length && j<brr.length){
				if(arr[i]<brr[j]){
					
					crr[k++]=arr[i];
					i++;
				}
				else {
					crr[k++]=brr[j];
					j++;
				}
				
			}
		while( i<arr.length ){
			crr[k++]=arr[i];
			i++;
		}
		while(j<brr.length){
			crr[k++]=brr[j];
			j++;
		}
		for(int l=0;l<crr.length;l++){
			System.out.print(crr[l]+" ");
		}
		
	}

}
