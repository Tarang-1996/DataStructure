public class LinkedList {

	public Node head; // head of list

	public int length() {
		Node ptr = head;
		int count = 0;
		while (ptr != null) {
			count++;
			ptr = ptr.next;
		}
		return count;
	}

	// Method to insert a new node
	public void insert(int data) {
		// Create a new node with given data
		Node new_node = new Node(data);

		// If the Linked List is empty,
		// then make the new node as head
		if (head == null) {
			head = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}

			// Insert the new_node at last node
			ptr.next = new_node;
		}
	}

	// Method to print the LinkedList.
	public void printList() {
		Node currNode = head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
		System.out.println();
	}

	public void joinList(LinkedList dest) {
		Node ptr = head;
		while (ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = dest.head;
	}
	public Node ReverseLinkedList(){
		Node current=head;
		Node prev=null,next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			
			current=next;
		}
		return prev;
	}

	public static Node findIntersaction(Node head1, Node head2) {

		Node ptr1 = head1;
		Node ptr2 = head2;
		while (ptr1 != null && ptr2 != null) {
			if (ptr1 == ptr2) {
				return ptr1;
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return null;
	}

	public Node moveListTillK(int d) {
		int count = 0;
		Node ptr = head;
		while (count < d) {
			ptr = ptr.next;
			count++;
		}
		return ptr;
	}
	

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);

		// Print the LinkedList
		list.printList();
		list.ReverseLinkedList();
		list.printList();
		
	}

	

}

class Node {

	int data;
	Node next;

	// Constructor
	Node(int d) {
		data = d;
		next = null;
	}
}