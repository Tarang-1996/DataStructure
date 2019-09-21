//import LinkedList.Node;

public class FindIntersectionNode {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(6);
		list1.insert(77);
		list1.insert(55);
		list1.insert(63);
		list1.insert(62);

		LinkedList list2 = new LinkedList();
		list2.insert(7);
		list2.insert(8);
		list2.insert(13);
		list2.insert(64);
		list2.insert(55);

		LinkedList list3 = new LinkedList();
		list3.insert(8);
		list3.insert(5);

		list1.joinList(list3);
		list2.joinList(list3);

		list1.printList();
		System.out.println(list1.length());
		list2.printList();
		System.out.println(list2.length());

		int length1 = list1.length();
		int length2 = list2.length();

		Node node;
		int d = length1 - length2;
		if (d == 0) {
			node = LinkedList.findIntersaction(list1.head, list2.head);
		} else if (d > 0) {
			Node temp = list1.moveListTillK(d);
			node = LinkedList.findIntersaction(temp, list2.head);
		} else {
			Node temp = list2.moveListTillK(d);
			node = LinkedList.findIntersaction(list1.head, temp);
		}
		
		System.out.println(node.data);
		/*
		 * list.head.next.next.next.next = list2.head; list1.head.next.next.next
		 * = list2.head; int l1 = findLength(list); int l2 = findLength(list1);
		 * LinkedList.Node fast = null; LinkedList.Node slow = null; if (l1 >
		 * l2) { fast = list.head; for (int j = 0; j < (l1 - l2); j++) { fast =
		 * fast.next; } slow = list1.head; } else { fast = list1.head; for (int
		 * j = 0; j < (l2 - l1); j++) { fast = fast.next; } slow = list.head; }
		 * while (fast != null && slow != null) { if (fast == slow) {
		 * System.out.println(fast + " " + fast.data); System.out.println(slow +
		 * " " + slow.data); break; } fast = fast.next; slow = slow.next; }
		 */

	}

}
