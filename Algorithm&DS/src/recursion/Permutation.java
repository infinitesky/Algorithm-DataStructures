package recursion;

public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input  = "abcd";
		permutation("", input);

	}



	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    System.out.println("This is current string: "+str);
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	        {
	        	System.out.println("This is before going into permutation " + i );
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	            System.out.println("This is after coming out of permutation " + i );
	        }
	    }
	}
	
}
