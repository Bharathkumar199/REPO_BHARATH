package TASK_1;

public class function_fibonaci 
{
	public static void fibo()
	{
	    int n=10;int fib1=0,fib2=1,next_terms;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=1;i<=n;i++)
		{
			 next_terms=fib1+fib2;
			 System.out.println(next_terms);
			fib1=fib2;
			fib2=next_terms;
		}
	}
	public static void fibo1(int n)
	{
		int fib1=0,fib2=1,next_terms;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=1;i<=n;i++)
		{
			 next_terms=fib1+fib2;
			 System.out.println(next_terms);
			fib1=fib2;
			fib2=next_terms;
		}
	}
	public static void main(String[] args) {
		fibo();
		fibo1(11);
	}
}
