package ProjectEuler;

public class Problem4 {

	public static void main(String[] args) {

		int a = 999;
		int b = a;
		int product=0;
		int Max = 0;



		for (int j = a; j>0; j--)
		{
			for (int i = b ; i > 0 ; i--)
			{
				product = i*j;

				String prodString = String.valueOf(product);
				if (prodString.equals(new StringBuilder(prodString).reverse().toString()))
				{
					if (Integer.parseInt(prodString)> Max)
						Max = Integer.parseInt(prodString);
					break;
				}
			}
		}

		System.out.println(Max);
	}

}
