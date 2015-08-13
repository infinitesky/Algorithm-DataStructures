package Trees;

public class BinaryTree {

	static int  count =0;
	public static void main(String args[])
	{
		
		Node root = null;
		Node left= null;
		Node right =  null;
		
		
		for (int i= 0; i<3; i++)
		{
			int random = (int) (Math.random()*5)+3;
			root = createBinaryTree(random, root);
		}
		
		System.out.println(root.data);
	}
	
	public static Node createBinaryTree(int insertdata, Node node)
	{
		
		
		if (node==null)
		return new Node( insertdata, null, null);
		else
		{
			if(insertdata <node.data)
			{
				node.left = createBinaryTree(insertdata, node.left);
				System.out.println(count +" inserted on left : " + insertdata);
				count++;
			}
			else
			{
				node.right = createBinaryTree(insertdata, node.right);
				System.out.println(count + "inserted on right : " + insertdata);
				count++;
			}
			
			return node;
			
		}
		
		
	}
	
}
