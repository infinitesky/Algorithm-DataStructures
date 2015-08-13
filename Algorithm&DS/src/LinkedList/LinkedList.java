package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

	
	
	public static void main (String args[])
	{
		
		//Node node = new Node();
	//	node.data = "First node";
	   Node tail = null;
		Node head = null;
		
		int[] listInput = {1,2,3,4,5,6,2,7,8,9};
		for (int a: listInput)
		{
			head =insertNodetoFront(" Element: "+ a, head);
		}
		
		
	/*	for (int i=1; i<=10;i++){
		head =insertNodetoFront(" Element: "+ i, head);
		//tail = insertNodetoLast(" Element: "+ i, tail);
		}*/
		
		String result = viewListElements(head);
		System.out.println(result);
		
		
		Node afteroperation = insertNode(" Element: 5.5", head, 12);
	//	head = deleteNodeFromFront(head);
	//	head = deleteNodeFromFront(head);
	//	tail = insertNodetoLast("Last element", tail);
		//System.out.println(tail);
	
		result = viewListElements(afteroperation);
		//System.out.println(result);
		
	}
	
	public static String viewListElements(Node head)
	{
		Node temp = head;
		if (head == null)
		{
			return "No Elements exists in List";
		}
		int count =0; 
		while(temp!=null)
		{
			count++;
			
			System.out.print(temp + " ---> ");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();
		return "total elements in the list: "+ count;
		
	}
	
	public static Node insertNodetoFront(String data, Node head)
	{
		Node temp  = new Node(data, null);
	
		if (head == null)
		{
			head = temp;
		}
		else
		{
		temp.next = head;
		head = temp;
		}
		
		return head;
		
	}
	
	
	public static Node insertNodetoLast(String data, Node tail)
	{
		Node temp  = new Node(data, null);
	
		if (tail == null)
		{
			tail = temp;
		}
		else
		{
		 tail.next = temp;
		tail = tail.next;
	
		}
		
		return tail;
		
	}
	
	public static Node deleteNodeFromFront(Node head)
	{
		if (head == null)
		{
		 throw new NoSuchElementException();
		}
		return head.next;
	}
	
	
	public static Node insertNode(String data, Node head, int Position)
	{
		Node temp = head;	
		//Node tempInsert = new Node(data, null);
		Node Newinsert = new Node(data, null);
	//	Node temp = head; 
		
		for (int i=1; i<Position;i++)
		{
			if (temp!=null)
			{
				temp = temp.next;
			}
		}
		
		Newinsert.next = temp.next;
		temp.next = Newinsert;
		
		return head;
		
		
	}
	
	public static Node deleteDuplicateNodeFromList(Node head)
	{
		Node temp = head;
		if (head == null)
		{
		 throw new NoSuchElementException();
		}
		else
		{
			while(temp!=null)
			{
				
				temp = temp.next;
				String tempdata = temp.data;
				
			//	if ()
			}
			
		}
		return head.next;
	}
	
	
	
}
