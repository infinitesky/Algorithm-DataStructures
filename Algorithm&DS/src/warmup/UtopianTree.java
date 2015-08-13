package warmup;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


		Scanner scan = new Scanner(System.in);
		int inputTestCases = scan.nextInt();
		int result =0;

		if (inputTestCases>=1 && inputTestCases<=10)
		{
			for (int i =0 ;i< inputTestCases;i++)
			{

				int inputCycles = scan.nextInt();

				if (inputCycles>=1 && inputCycles<=60)
				{
					if (inputCycles%2==0)
					{
						result= CalculateNthCycleForEven(inputCycles);
					}
					else
					{
						result= CalculateNthCycleForEven(inputCycles);
						result = 2*result;
					}
				}
				System.out.println(result);
			}


		}



	}

	public static int CalculateNthCycleForEven(int cycle)
	{
		int result = 0;
		if (cycle%2==0)
			cycle = (cycle/2)+1;
		else
			cycle = ((cycle+1)/2);
		result = (int) (Math.pow(2, cycle)-1);

		return result;
	}

}
