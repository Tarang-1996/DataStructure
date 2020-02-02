public class CreateBST {
	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}

	}

	public Node insert(Node node, int i) {
		if (node == null) {
			node = new Node(i);
		} else if (i <= node.data) {
			node.left = insert(node.left, i);
		} else {
			node.right = insert(node.right, i);
		}

		return node;
	}

	public boolean isBst(Node root) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		return BSTUtil(root, max, min);
	}

	public boolean BSTUtil(Node node, int max, int min) {
		if (node == null) {
			return true;
		}
		if ((node.data >= min) && (node.data <= max)) {
			boolean isleft = BSTUtil(node.left, node.data, min);
			boolean isRight = BSTUtil(node.right, max, node.data);
			return isleft && isRight;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 9, 8, 2, 7, 8 };
		CreateBST bst = new CreateBST();
		Node root = null;
		for (int i = 0; i < arr.length; i++) {
			root = bst.insert(root, arr[i]);

		}

		inOrderTraversal(root);
		System.out.println();
		boolean result = bst.isBst(root);
		System.out.println(result);
	}

	private static void inOrderTraversal(Node node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		System.out.print(node.data + "\t");
		inOrderTraversal(node.right);
	}
	
	private static void preOrderTraversal(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + "\t");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	private static void postOrderTraversal(Node node) {
		if (node == null)
			return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + "\t");
	}
	
}
