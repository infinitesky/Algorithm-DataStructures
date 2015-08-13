package Foobar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem3 {

	
	public static void main(String args[])
	{
		
	
		String documentString = "world where hello hello there world";
		String [] searchWords = {"hello", "world"};
		
		
		String [] document = documentString.split(" ");
		
		searchInArray(document, searchWords);
		List search = new LinkedList();
		
		for (String word: searchWords)
		{
			search.add(word);
		}
		
		
		
		
	}
	
	
	public static void searchInArray(String[] document, String[] searchword )
	{
		
	String [][] c = new String[500][100];
	
	
		
		
	}
	
	
	
}
