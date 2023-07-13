package TASK_1;

import java.util.Scanner;

public class perfect_no 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any number");
		int n=sc.nextInt(); int sum=0;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
		}  
		System.out.println();
		System.out.println("hi");
	}  
}
