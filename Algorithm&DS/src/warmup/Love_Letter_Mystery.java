package warmup;

import java.util.Scanner;

public class Love_Letter_Mystery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char [] inputStringAsCharArray;
		//char[] auxArray = new char[100000];
		Scanner input = new Scanner(System.in);

		int TestCases = 	input.nextInt();


		for (int i =0; i<TestCases; i++)
		{

			if (TestCases >=1 && TestCases <=10)
			{
				String testinput = input.next();

				int count = 0;
				if (testinput.matches("\\p{javaLowerCase}*"))
				{
					inputStringAsCharArray = testinput.toCharArray();
					int length = inputStringAsCharArray.length;

					
					for (int j=0; j<length/2;j++)
					{
						int diff = 0;
						if (inputStringAsCharArray[j]!= inputStringAsCharArray[(length-1)-j] && inputStringAsCharArray[j]<inputStringAsCharArray[(length-1)-j] )
						{
							int a = inputStringAsCharArray[(length-1)-j] ;
							int b = inputStringAsCharArray[j];
							System.out.println("values of a  and b are "+ a + " " + b + " respectively");
							diff = inputStringAsCharArray[(length-1)-j] - inputStringAsCharArray[j];

						}
						else
							diff =  inputStringAsCharArray[j] -  inputStringAsCharArray[(length-1)-j];

						count = count + diff;
					}

				}

				System.out.println(count);
			}
		}

	}

}
