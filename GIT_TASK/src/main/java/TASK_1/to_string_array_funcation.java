package TASK_1;

public class to_string_array_funcation 
{
	public static void ma()
	{
		String cs="who are you";
		char arr[]=cs.toCharArray();
		String cv="how";
		char arr1[]=cv.toCharArray();
		String cx="who";
		char arr2[]=cx.toCharArray();
		int count=0; int index=0,k=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr2.length;j++) 
			{
				if(arr[i+j]==arr2[j])
				{
					count++;

				}
			}
			if(count==arr2.length) 
			{
				index=i;

				for(int m=0;m<arr1.length;m++)
				{
					arr[index]=arr1[m];
					index++;
				}

				break;
			}
		}
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]);
		}


	}
	public static void ma1(char arr[],char arr1[],char arr2[])
	{
		System.out.println();
		System.out.println();
		int count=0; int index=0,k=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr2.length;j++) 
			{
				if(arr[i+j]==arr2[j])
				{
					count++;

				}
			}
			if(count==arr2.length) 
			{

				index=i;

				for(int m=0;m<arr1.length;m++)
				{
					arr[index]=arr1[m];
					index++;
				}

				break;
			}
		}
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]);
		}

	}
	public static void main(String[] args) {
		ma();
		String cs="who are you";
		char arr[]=cs.toCharArray();
		String cv="why";
		char arr1[]=cv.toCharArray();
		String cx="who";
		char arr2[]=cx.toCharArray();
		ma1(arr,arr1,arr2);
		
	}

}
