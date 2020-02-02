
public class DynamicQueue {
	Node rare=null;
	Node front=null;
	LinkedList ls=new LinkedList();
	public void Enqueue(int data){
		Node n=new Node(data);
		if(rare==null){
			front=rare=n;
		}
		else{
			rare.next=n;
			rare=n;
		}
	}
	int Dequeue(){
		if(front==null){
			System.out.println("Queue is empty");
		}
		int value=front.data;
		front=front.next;
		if(front==null){
			rare=null;
		}
		return value;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicQueue dq=new DynamicQueue();
		dq.Enqueue(2);
		dq.Enqueue(3);
		dq.Dequeue();
	}

}
