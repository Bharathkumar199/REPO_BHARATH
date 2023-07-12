package TASK_1;

import java.util.Scanner;

public class school 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
     sc.close();

		if(n>=85)
		{
			System.out.println("then  A grade");
		}
		else if (n>=60&&n<80) 
		{
			System.out.println("then  B grade");
		}
		else if (n>=50&&n<60) 
		{
			System.out.println("then  c grade");
		}
		else if (n>=45&&n<50) 
		{
			System.out.println("then  D grade");
		}
		else if (n>=25&&n<50) 
		{
			System.out.println("then  E grade");
		}
		else {
			System.out.println("then  F grade");
		}
	}
}
