package TASK_1;

import java.util.Scanner;

public class Map_string 
{
	static char[]  su()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String cv=sc.nextLine();
		char arr[]=cv.toCharArray();
		sc.close();
		return arr;
	}

	static void su1(char f[])
	{
		int count=1;
		for(int i=0;i<f.length;i++)
		{
			if(f[i]==' ')
			{
				if(!(i==0||i==f.length-1))
				{
					count++;
				} 
				if(f[i+1]==' ')
				{
					count--;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args)
	{
		char[] f=su();
		su1(f);
	}
}
