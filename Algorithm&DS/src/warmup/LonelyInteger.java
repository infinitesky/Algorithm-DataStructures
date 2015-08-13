package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LonelyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());

		if (((_a_size)%2==1) &&  (_a_size >=1 && _a_size<100))
		{
			int[] _a = new int[_a_size];
			int _a_item;
			String next = in.nextLine();
			String[] next_split = next.split(" ");

			for(int _a_i = 0; _a_i < _a_size; _a_i++) {
				_a_item = Integer.parseInt(next_split[_a_i]);
				_a[_a_i] = _a_item;
			}

			res = lonelyinteger(_a);
			System.out.println(res);

		}
	}
	
	static int lonelyinteger(int[] a) {

		
		HashMap<Integer,Integer> arrayValues = new HashMap<Integer, Integer>();
		
		int result=0;
		if (a.length ==1)
			result = a[0];
		else if (a.length>=0 && a.length<=100)
		{
		
			//int count=1;
			int countonce=1;
			for (int i:a)
			{
				if (arrayValues.containsKey(i))
				{
					arrayValues.remove(i);
				}
				else
				{
					countonce=1;
					arrayValues.put(i,countonce);
				}
			}
			
			for (int key: arrayValues.keySet())
			{
				result = key;
			}
			
			
		}
		
		
		
		return result;

	}
	
}
