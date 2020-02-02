class Node2{
	Node2 next;
	int data;
	Node2(int data){
		next=null;
		this.data=data;
	}
}
public class Hash {
	Node2 arr[]=new Node2[107];
	public int hash(String S){
		int hash=5381;
		int capacity=107;
		for(int i=0;i<S.length();i++){
			hash=(hash<<5)-hash+(S.charAt(i));
			hash=hash%capacity;
		}
		return Math.abs(hash);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] arr={"abc","bca","adc","cab"};
			for(int i=0;i<arr.length;i++){
				if(arr[i]==null){
					
					
				}
			}
	}

}
