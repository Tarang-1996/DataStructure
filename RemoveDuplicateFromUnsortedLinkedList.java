
public class RemoveDuplicateFromUnsortedLinkedList {
	public static void removeDuplicate(Node head, LinkedList list){
			Node temp=head;
			int[] arr=new int[255];
			while(temp!=null){
				arr[temp.data]++;
				temp=temp.next;
			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]>0){
					System.out.println(i);
				}
			}
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(4);
		list.insert(9);
		list.insert(3);
		list.insert(4);
		list.printList();
		removeDuplicate(list.head,list);
		list.printList();

	}

}
