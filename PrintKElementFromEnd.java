public class PrintKElementFromEnd {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(5);
		list.insert(67);
		list.insert(7);
		list.insert(9);
		list.insert(90);
		list.insert(93);
		list.insert(94);
		list.insert(96);
		list.printList();
		int d = 4;
		Node temp1 = list.moveListTillK(d);
		Node temp2 = list.head;
		while (temp1!= null) {
			temp2 = temp2.next;
			temp1 = temp1.next;

		}
		System.out.println(temp2.data);

	}

}
