package Algorithms;

import java.lang.reflect.Array;
import java.util.Scanner;

public class InsertionSortPart1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arraysize = getsizeofarray();
			
		int [] sortedArray = getSortedArray(arraysize);
		
		int lastvalue = sortedArray[arraysize-1];
		//int i=arraysize-2;
		int index;
		
		if (arraysize ==1)
			showsortedarray(sortedArray);
			
		if (arraysize==2 && (sortedArray[1] < sortedArray[0]))
		{
			int temp = sortedArray[1];
			sortedArray[0] = sortedArray[1];
			sortedArray[1] = temp;
			showsortedarray(sortedArray);
		}
		else if(arraysize==2 && (sortedArray[1] > sortedArray[0]))
			showsortedarray(sortedArray);
		
		if (arraysize >=3){
		for (index  = arraysize-1; index>0 ; index--)
		{
									
			if (lastvalue < sortedArray[index-1])
			{
				sortedArray[index] = sortedArray[index-1];
				showsortedarray(sortedArray);
			}
			
			else
			{
				sortedArray[index] = lastvalue;
				
					
				break;
			}
			 
		}
		
		if(index==0)
			sortedArray[index] = lastvalue;
		showsortedarray(sortedArray);}
		
		
		
	//	showsortedarray(sortedArray);
		
		
		
		
			}

	private static int getsizeofarray() {
		// TODO Auto-generated method stub
		Scanner getsize = new Scanner(System.in);
		System.out.println("Please enter the size of the input");
		int arraysize = getsize.nextInt();
		return arraysize;
	}

	private static void showsortedarray(int []sortedarray) {
		// TODO Auto-generated method stub
		
		int getsize = sortedarray.length;
	//	System.out.println("Sorted Array is : ");
		for (int i=0; i<getsize ; i++)
		{
			
			System.out.print(sortedarray[i] + " \t ");
			
		}
		System.out.println("\n");
		
		
	}

	private static int []  getSortedArray(int arraysize) {
		// TODO Auto-generated method stub
		
		int [] orderedArray = new int[arraysize];
		Scanner inputValues = new Scanner(System.in);

		System.out.println("Enter sorted values in Array");
		int [] ordered = new int[arraysize]; 
		for (int i=0; i<ordered.length ; i++)
		{
			orderedArray[i] = inputValues.nextInt();
		}
		
		return orderedArray;

	}

}
