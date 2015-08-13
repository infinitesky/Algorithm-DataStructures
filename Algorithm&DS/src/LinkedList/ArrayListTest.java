package LinkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList test = new ArrayList();
		
		test.add("one");
		test.add("two");
		test.add("three");
		test.add("fourth");
		
		System.out.println(test);
		
	//	test.remove(4);
		System.out.println(test);
		ListIterator iter = test.listIterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
			iter.previous();
			
		}
		
	}

}
