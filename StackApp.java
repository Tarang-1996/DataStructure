
public class StackApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,4,6,2,8,5,1,10};
		DynamicStack s=new DynamicStack();
		for(int i=0;i<arr.length-1;i++){
			if(s.top==null){
				s.push(arr[i]);
				
			}
			else if(s.top.data<arr[i]){
				s.push(s.top.data);
			}
			else{
				s.push(arr[i]);
			}
		}
		System.out.println(s.peek());
		s.pop();
		s.pop();
		System.out.println(s.peek());
	}

}
