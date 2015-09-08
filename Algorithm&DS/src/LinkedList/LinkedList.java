package LinkedList;
import java.util.NoSuchElementException;

public class LinkedList {

    
    
    public static void main (String args[])
    {
        
        Node head = null;
        
        
        for (int i=1; i<=10;i++){
        head =insertNodetoFront(" Element: "+ i, head);
        }
        
        String result = viewListElements(head);
        
        head = Reverse(head);
        String resultreverse = viewListElements(head);
        System.out.println(result);
        
        insertNode(" Element: 5.5", head, 5);
    //    head = deleteNodeFromFront(head);
    //    head = deleteNodeFromFront(head);
    
        System.out.println(head);
    
        result = viewListElements(head);
        System.out.println(result);
        
    }
    
    public static String viewListElements(Node head)
    {
        Node temp = head;
        if (head == null)
        {
            return "No Elements exists in List";
        }
        int count =0; 
        System.out.print(temp + " ---> ");
        while(temp!=null)
        {
            temp = temp.next;
            System.out.print(temp + " ---> ");
            count++;
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
            
        //Node tempInsert = new Node(data, null);
        Node temp = new Node(data, null);
        //temp = head; 
        
        for (int i=0; i<Position;i++)
        {
            if (head!=null)
            {
                head = head.next;
            }
        }
        
        temp.next = head;
        head = temp;
        
        return head;
        
        
    }
    
    public static Node Reverse(Node head)
    {

    	if (head == null || head.next == null)
    		return null;  //empty or just one node in list

    	Node Second = head.next;

    	//store third node before we change 
    	Node Third = Second.next;  

    	//Second's next pointer
    	Second.next = head;  //second now points to head
    	head.next = null;  //change head pointer to NULL

    	//only two nodes, which we already reversed
    	if (Third == null)
    		return null;  

    	Node CurrentNode = Third;

    	Node PreviousNode = Second;

    	while (CurrentNode != null)
    	{ 
    		Node NextNode = CurrentNode.next;

    		CurrentNode.next = PreviousNode;

    		/*  repeat the process, but have to reset
    	     the PreviousNode and CurrentNode
    		 */

    		PreviousNode = CurrentNode;
    		CurrentNode = NextNode;  
    	}

    	head  = PreviousNode; //reset the head node
    	return head;
    }

    	
    	
    
    
    
}