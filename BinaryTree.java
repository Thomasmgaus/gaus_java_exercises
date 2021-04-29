

public class BinaryTree{

	private Node root;

	public Node addNode(Node current, int value){
		if(current == null){
			return new Node(value);
		}
		if(value > current.value){
			current.right = addNode(current.right, value);
		}
		if(value < current.value){
			current.left = addNode(current.left, value);
		}
		return current;

	}

	
	
	
	
	
	
	public class Node{
	
	int value;
	Node left;
	Node right;
		
	Node(int value){
		this.value = value;
		left = null;
		right = null;
	}

	}

}

