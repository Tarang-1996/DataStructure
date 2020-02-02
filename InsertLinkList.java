public class InsertLinkList {
	 Node head;
	 
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			 data=d;
			 next=null;
		}
	}
//	public static Node head=null;
	public static InsertLinkList  insertNode(InsertLinkList list,int n){
		Node new_node= new Node(n);
		new_node.next=null;
		
		if(list.head==null){
			list.head=new_node;
		}
		else{
			Node temp=list.head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
		}
		return list;
		
	}
	public static void display(InsertLinkList list){
		
		Node temp=list.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
			}
	}
	 public static InsertLinkList delete(InsertLinkList list, int d){
		 
		 Node temp=list.head;
		 while(temp!=null){
			 if(temp.data==d){
				 temp.next=temp.next.next;
			 }
			 	temp=temp.next;
		 }
		return list;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertLinkList list=new InsertLinkList();
		list=insertNode(list,2);
//		display(list);
		list=insertNode(list,3);
		list=insertNode(list,4);
		list=insertNode(list,5);
		display(list);
		display(delete(list,4));
		
		

	}

}
