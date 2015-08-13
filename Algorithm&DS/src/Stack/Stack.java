package Stack;

import javax.swing.Popup;

import LinkedList.Node;

public class Stack implements IStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node top = null;
		for (int i=1; i<=10;i++)
		{
			top = Push(top, "Element"+ i);
		}
		
		System.out.println(top);
		
		top = Pop(top);
		
		System.out.println(top);
		
	}

	
	public void createStack(Node element, int data)
	{
		
		
	}
	
	
	public static Node Push(Node top, String data) {
		
		Node temp = new Node(data, null );
		
		temp.next = top;
		top=temp;
		
		
		return top;
		// TODO Auto-generated method stub
		
	}

	
	
	public static Node Pop(Node top) {
		
				
		if (top==null)
		{
			throw new RuntimeException(" Stack is empty! . Cannot remove the element from stack");
		}
		else
		{
			top=top.next;
		}
		
		return top;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int CountElement(Node Element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean IsStackEmpty(Node element) {
		return true;
		// TODO Auto-generated method stub
		
	}


	@Override
	public int sizeofStack(Node element) {
		// TODO Auto-generated method stub
		return 0;
	}

}
