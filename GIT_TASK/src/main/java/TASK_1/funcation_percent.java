package TASK_1;

public class funcation_percent 
{
	public static void per()
	{
		int held_class=80;
		int attend_class=60;
		float total_percentage;
		total_percentage=(float)attend_class/held_class*100;
		if(total_percentage>=75)
		{
			System.out.println("They will sit in the exam");
			System.out.println(total_percentage);
		}
		else
		{
			System.out.println("They will not sit in the exam");
		}
	}
	public static void per1(int held_class,int attend_class)
	{
	    float total_percentage;
		total_percentage=(float)attend_class/held_class*100;
		if(total_percentage>=75)
		{
			System.out.println("They will sit in the exam");
			System.out.println(total_percentage);
		}
		else
		{
			System.out.println("They will not sit in the exam");
		}
	}
	public static void main(String[] args)
	{
		per();
		per1(85,60);
	}

}
