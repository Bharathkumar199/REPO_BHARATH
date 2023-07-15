package TASK_1;

import java.util.Scanner;

public class find_duplicate 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String cv=sc.nextLine();
		char arr[]=cv.toCharArray();
		String cs=sc.nextLine();
		int count=0;
		for( int i=0;i<arr.length;i++)
		{
			for(int  j=i+1;j<arr.length;j++)
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

		        System.out.println("hi");
			System.out.println("hi hello");
		}
	}
}
