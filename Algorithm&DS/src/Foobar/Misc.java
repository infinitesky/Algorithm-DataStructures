package Foobar;

public class Misc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 18;
		
		int a=10;int b= 20;
		
		System.out.println((x>>1));
		System.out.println(Integer.toBinaryString(x>>1));
		
		int y = Integer.parseInt("1000100",2);
		System.out.println(y>>2);
		
		swap(a,b);
		System.out.println("a="+a + "and b="+b);
	}

	
	public static void swap(int x, int y)
	{
		System.out.println("x="+x + "and y="+y);
		int temp=x;
		
		x = y;
		y =temp;
		
	}
	
}
