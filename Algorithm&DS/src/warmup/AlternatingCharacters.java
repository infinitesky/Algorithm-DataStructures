package warmup;

import java.util.Scanner;

public class AlternatingCharacters {


	public static void main (String args[])
	{

		char [] alternateString;
		char[] auxArray = new char[100000];
		Scanner input = new Scanner(System.in);

		int TestCases = 	input.nextInt();


		for (int i =0; i<TestCases; i++)
		{

			String testinput = input.next();

			alternateString = testinput.toCharArray();
			int length = alternateString.length;

			int count = 0;
			for (int j=0; j<length-1;j++)
			{

				if (alternateString[j]== alternateString[j+1])
				{
					count++;
				}

			}

			System.out.println(count);
		}

	}

}
