package recursion;

public class RecursiveForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveLoop(3);

	}
	
	public static void recursiveLoop(int n)
	{
		int p =n;
		if (p ==0)System.out.println("print base");
		
		else
		{
			for(int i=0;i<p;i++)
		{
			System.out.println("This is before going into permutation. i=" + i + " p= "+ p);
			recursiveLoop(--p);
			System.out.println("This is after coming out of permutation. i=" + i + " p="+ p );
		}
			System.out.println("finsihed the for loop");
		
		}
		System.out.println("outside else block the for loop");
	}

}
