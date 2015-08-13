package StringTest;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = new String("cat");
		
		String b = new String("CAT");
		
	//	a=b;
		
		if (a == b)
			System.out.println("TRUE for == ");
		else
			System.out.println("FALSE for ==");
		if (a.equals(b))
			System.out.println("TRUE for EQUALS");
		else
		System.out.println("FALSE for EQUALS");
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		
	Object obj1 = obj.toString().compareToIgnoreCase((String) obj);
		
		return super.equals(obj1);
	}
	
	

}
