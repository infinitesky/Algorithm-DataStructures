package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingBits {



	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner input = new Scanner(System.in);
		int testcases = input.nextInt();

		if (testcases>=1 && testcases<=1000)
		{

			for (int i =0; i<testcases;i++)
			{
				long inp = input.nextLong();

				if (inp>=0 && inp<=Math.pow(2,32))
				{

					String flip = Long.toBinaryString(~inp);
					String bit32flip = flip.substring(32);
					long  result = Long.parseLong(bit32flip,2);
					System.out.println(flip);
					System.out.println(bit32flip);
					System.out.println(result);

				}
			}
		}

	}
}

