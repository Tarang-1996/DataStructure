
public class Queue {
	int rare=-1;
	int front=-1;
	int[] arr=new int[10];
	void Enqueue(int data){
		if(rare==arr.length-1){
			System.out.println("queue is full");
			
		}
		if(front==-1){
			front=0;
		}
		arr[++rare]=data;
	}
	int Dequeue(){
		if(front==-1){
			System.out.println("queue is empty");
			return -1;
		}
		int value=arr[front--];
		if(front>rare){
			front=rare=-1;
			return -1;
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(3);
		q.Dequeue();
		
	}

}
