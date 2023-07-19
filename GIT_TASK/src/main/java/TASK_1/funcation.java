package TASK_1;

public class funcation 
{
	public static void od()
	{
		String ch="MY NAME BHATATH";
		char arr[]=ch.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65&&arr[i]<=90)
			{
				arr[i]=(char)(arr[i]+32);
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
	}
	public static void od1(char arr[])
	{
        System.out.println();
        System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65&&arr[i]<=90)
			{
				arr[i]=(char)(arr[i]+32);
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]);
			}		
		}
	}
	public static void main(String[]args) 
	{
		od();
		String b="BHATATH";
		char arr[]=b.toCharArray();
		od1(arr);
	}
}
