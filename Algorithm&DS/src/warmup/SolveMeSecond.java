package warmup;
import java.io.*;
import java.util.*;

class SolveMeSecond {

	static int solveMeSecond(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		int sum=0;
		int a,b;
		t = in.nextInt();
		if (t>=1 && t<=1000)
		{
			for (int i=0;i<t;i++) {
				a = in.nextInt();
				b = in.nextInt();
				
				if ((a>=1 && a<=1000) && (b>=1 && b<=1000))
				sum = solveMeSecond(a, b);
				System.out.println(sum);
			}
		}
	}
}

