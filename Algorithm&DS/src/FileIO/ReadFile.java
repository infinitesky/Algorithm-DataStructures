package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sun.misc.IOUtils;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\xyz\\Desktop\\example.txt");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line = null;
			
			while ((line = br.readLine())!= null)
			{
				String[] count = line.split("\\s+");
				
				for (String word: count)
					System.out.println(word);
				
				System.out.println(count.length);
			}
			
			System.out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\Rchoudha\\Desktop\\INC 38116.txt"));
		String line =null;
		while ((bfr.readLine())!=null)
		{
			//String line = bfr.readLine();
			System.out.println(bfr.readLine());
		}
			
		bfr.close();
		File test = new File("C:\\Users\\Rchoudha\\Desktop\\INC 38116.txt");
		System.out.println();
		
		
	}

}
