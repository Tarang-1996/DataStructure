
public class CreateBST {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
		
	}
	public Node  insert(Node node, int i) {
		// TODO Auto-generated method stub
		if(node==null){
			node=new Node(i);
		}
		else if(i<=node.data){
			node.left=insert(node.left,i);
		}
		else{
			node.right=insert(node.right,i);
		}
		 
		return node;
	}
	
	public boolean isBst(Node root){
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		return BSTUtil(root,max,min);
	}
	public boolean BSTUtil(Node root,int max,int min){
		if(root==null){
			return true;
		}
		if((root.data>=min) && (root.data<max)){
		boolean	isleft=BSTUtil(root.left,root.data,min);
		boolean isRight=BSTUtil(root.right,max,root.data);
		return isleft && isRight;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,5,6,9,8,2,7,8};
		CreateBST bst=new CreateBST();
		Node root=null;
		for(int i=0;i<arr.length;i++){
			root=bst.insert(root,arr[i]);
			
		}
		boolean result=bst.isBst(root);
		System.out.println(result);
	}
}
