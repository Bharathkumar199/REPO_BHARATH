package TASK_1;

public class find_duplicate_method 
{
	public static void dupli(int arr[])
	{

		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
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
				System.out.println(arr[i]);
			}
			count=0;
		}

	}

	public static void main(String[] args)
	{		
		int arr[]= {10,20,20,30,30};
		dupli(arr);
		System.out.println("heel");
	}
}
