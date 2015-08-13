package Algorithms;

import java.lang.reflect.Array;
import java.util.Scanner;

public class InsertionSort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arraysize = getsizeofarray();
			
		int [] sortedArray = getSortedArray(arraysize);
		
		int i;
		
		for (i=1; i<arraysize; i++)
		{
			
			int j= i;
			int insertelement = sortedArray[i];
			
			while ( j>0 && (insertelement < sortedArray[j-1]) )
			{
				
				sortedArray[j] = sortedArray[j-1];
				j--;
				
			}
			
			sortedArray[j] = insertelement;
			showsortedarray(sortedArray);
			
			
		}	
	
			
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
