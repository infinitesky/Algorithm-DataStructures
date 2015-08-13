package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ACMICPC {



	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner inputText = new Scanner(System.in);
		String  InputString = inputText.nextLine();
		String[] elements = InputString.split(" ");
		int getNumberofPeople = Integer.parseInt(elements[0]);

		int getNumberOfTopics = Integer.parseInt(elements[1]);
		String [] inputNValuesAsStringArray = new String[(int) getNumberofPeople];
		int N = getNumberofPeople;
		int MaxTopics = 0;
		int MaxTeamofTwo= 0;
		if ((getNumberofPeople>=2 && getNumberofPeople<=500) && (getNumberOfTopics>=1 && getNumberOfTopics<=500))
		{
			for (int i =0; i<getNumberofPeople; i++)
			{

				inputNValuesAsStringArray[i] = inputText.nextLine();
			}




			for (int i=0;i<N; i++)
			{

				for (int j=i+1; j<N; j++)
				{
					int count = 0;
					char[] input = inputNValuesAsStringArray[i].toCharArray();
					char[] input2 = inputNValuesAsStringArray[j].toCharArray();
					for (int k=0 ; k < getNumberOfTopics;k++)
					{


						if ( input[k] == '1' || input2[k]=='1')
						{

							count++;
							

						}
					}
					
					if (count == MaxTopics)
					{
						
						MaxTeamofTwo++;
					}
					if (count>MaxTopics)
					{	
						
						MaxTopics = count;
						MaxTeamofTwo = 1;

					}
				
				}

			}

		}
		System.out.println(MaxTopics);
		System.out.println(MaxTeamofTwo);

	}
}
