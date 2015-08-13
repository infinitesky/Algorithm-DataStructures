package EnumExample;

public class  Days {



	public enum Day {
		SUNDAY ,
		MONDAY ,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY;

	}


	public static void main(String args[])
	{

		Day day = Day.FRIDAY;
		System.out.println(day);
		
		if (day == Day.FRIDAY)
			System.out.println("It's Friday! YAY!!");
		
		switch (day)
		{
		case FRIDAY:
		System.out.println("It's Friday!!");
		break;
		
		default:
			System.out.println("It's not Friday :(");
		
		}


	}

}