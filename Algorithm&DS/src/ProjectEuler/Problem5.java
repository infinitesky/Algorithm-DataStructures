package ProjectEuler;

public class Problem5 {

	public static void main(String[] args) {

		int flag=0;
		int number = 2;

		for (int i=40; i< Integer.MAX_VALUE; i=i+10)
		{
			for (int j=2; j<=20; j++)
			{
				if (i%j==0)
				{
					flag=j;
					continue;
				}
				else
					break;

			}

			if (flag==20)
			{
				System.out.println(flag);
				System.out.println(i);
				break;
			}
		}

	}

}
