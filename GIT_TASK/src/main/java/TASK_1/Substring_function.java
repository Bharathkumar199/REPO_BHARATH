package TASK_1;

public class Substring_function 
{
	public static void st()
	{
		String cv="my name is kumar";
		char arr[]=cv.toCharArray();
		String cs="my";
		int count=0;
		char arr1[]=cs.toCharArray();
		for(int i=0;i<arr1.length;i++)
		{
			   if(arr[i]==arr1[i])
			   {
				   count++;
			   }
	    }
		
		if(count==arr1.length)
		{
			System.out.println("then it is substring");
		}
		else
		{
			System.out.println("then it not is substring");
		}
	}
	public static void st1(char arr[],char arr1[])
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			   if(arr[i]==arr1[i])
			   {
				   count++;
			   }
	    }
		
		if(count==arr1.length)
		{
			System.out.println("then it is substring");
		}
		else
		{
			System.out.println("then it not is substring");
		}
	
}
	public static void main(String[] args) 
	{
		st();
		String d="my name is kumar";
		char arr[]=d.toCharArray();
		String c="kumar";
		char arr1[]=c.toCharArray();
		st1(arr,arr1);
	}
}
