package Trees;

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Node root  = new Node(1,null,null);
	     root.left             = new Node(2,null,null);
	     root.right           = new Node(3,null,null);
	     root.right.left = new Node (5,null,null);
	     root.left.left     = new Node(4,null,null);
	     root.left.left.right     = new Node(7,null,null);
	     root.left.left.right.right     = new Node(9,null,null);
	     root.left.left.left = new Node (6,null,null);
	     root.right.left.right  = new Node(8,null,null); 
	 
	     System.out.println("\n Preorder traversal of binary tree is \n");
	     printPreorder(root);
	 
	     System.out.println("\n Inorder traversal of binary tree is \n");
	     printInorder(root);  
	 
	     System.out.println("\n Postorder traversal of binary tree is \n");
	  //   printPostorder(root);
	 
	   
	   
	}
	
	// Given a binary tree, print its nodes in preorder
	static void printPreorder(Node node)
	{
	     if (node == null)
	          return;
	 
	     /* first print data of node */
	     System.out.println(node.data);  
	 
	     /* then recur on left sutree */
	     printPreorder(node.left);  
	 
	     /* now recur on right subtree */
	     printPreorder(node.right);
	}  
	
	static void printInorder(Node node)
	{
	     if (node == null)
	          return;
	 
	     	     
	 
	     /* first recur on left sutree */
	     printInorder(node.left);  
	 
	     System.out.println(node.data); 
	     /* now recur on right subtree */
	     printInorder(node.right);
	}  

}
