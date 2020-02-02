public class DynamicStack {
	// LinkedList stac=new LinkedList();
	Node top = null;

	public void push(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
	}

	public int pop() {
		if (top == null) {
			System.out.println("stack is empty");
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	public int peek() {
		if (top == null) {
			return -1;
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {

		DynamicStack ds = new DynamicStack();
		ds.push(2);
		System.out.println(ds.peek());
		ds.pop();
		ds.pop();

	}

}
