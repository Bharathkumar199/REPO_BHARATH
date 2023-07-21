package TASK_1;

public class Fact_funcation 
{
	public static void fact()
	{
		int fact=1,n=6;
		for(int i=1;i<=6;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void fact1(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args) {
		fact();
		fact1(7);
	}
}
