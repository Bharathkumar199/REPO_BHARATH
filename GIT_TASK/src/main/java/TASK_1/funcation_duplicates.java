package TASK_1;

public class funcation_duplicates 
{
	public static void dupl()
	{
		String sc= "hello my world";
		char arr[]=sc.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
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
				System.out.print(arr[i]+" ");
			}
			count=0;
		}
	}
	public static void dupli(char arr[])
	{
		System.out.println();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
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
				System.out.print(arr[i]+" ");
			}
			count=0;
		}
	}
	public static void main(String[] args) {
		dupl();
		String cv="my name is";
		char arr[]=cv.toCharArray();
		dupli(arr);
	}
}
