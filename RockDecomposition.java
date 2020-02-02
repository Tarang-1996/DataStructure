// there is a set of  rocks of different weights each time heaviest rock impact with each other and substitute is added into rocks. tell the last rock of the set. 
public class RockDecomposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={89,45,23,15,2};
		int r;
		int crr[]=new int[arr.length];
		MaxHeap m=new MaxHeap(crr);
		for(int i=0;i<arr.length;i++){
			m.insert(arr[i]);
		}
		for(int j=0;j<arr.length-1;j++){
			int x=m.pop();
			int y=m.pop();
//			System.out.println(x);
//			System.out.println(y);
			if(x>y){
				r=x-y;
				m.insert(r);
			}
			else{
				r=y-x;
				m.insert(r);
			}
		}
		System.out.println(m.pop());
	}

}
