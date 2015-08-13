package warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximizingXOR {
	/*
	 * Complete the function below.
	 */


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());

		int _r;
		_r = Integer.parseInt(in.nextLine());

		res = maxXor(_l, _r);
		System.out.println(res);

	}
	static int maxXor(int _l, int _r) {

		int Max = 0;
		if ((_l>=1 && _l<=1000) && (_r>=1 && _r<=1000) && (_l<=_r))
		{
			int value;
			for(int i= _l; i<=_r; i++)
			{
				int j=_l;
				while(j<=_r)
				{
					value = i ^ j;
					if (value>=Max)
						Max=value;
					j++;

				}
			}
		}


		return Max;
	}

}
