package ProjectEuler;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int count=3;
		int primecount=2;

		while (count>0 && primecount!=10002)
		{
			int flag =1;
			if (count%2==0)
			{
				count++;
				continue;
			}
			for (int i=2; i<=count/2; i++)
			{
				if (count%i==0)
				{
					flag=0;
					break;
				}

			}

			if (flag==0)
				count++;
			else
			{
				System.out.println("Count: "+  primecount +" Prime Number: "+ count);
				count++;
				primecount++;
			}
		}

	}

}
