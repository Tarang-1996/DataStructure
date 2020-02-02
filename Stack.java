
public class Stack {
	int top=-1;
	int arr[]=new int[10];
	void Push(int data){
		if(top==arr.length-1){
			System.out.println("stack is full");
		}
		arr[++top]=data;
	}
	int Pop(){
		return arr[top--];
	}
	boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	void peek(){
		System.out.println(arr[top]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		st.Push(2);
		st.Push(3);
		st.Push(5);
		st.Pop();
		st.peek();
	}

}
