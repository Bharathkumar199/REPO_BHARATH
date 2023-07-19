package TASK_1;

public class converting_funcation 
{
	public static void dupli()
	{
		String c="heelo my name is";
		char arr[]=c.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.print(arr[i]);
			}
			count=0;
		}
	}
	public static void dupli1(char arr[])
	{
		System.out.println();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.print(arr[i]);
			}
			count=0;
		}	
	}
	public static void main(String[] args)
	{
		dupli();
		String v="bharath kumar";
		char arr[]=v.toCharArray();
		dupli1(arr);
	}
}
