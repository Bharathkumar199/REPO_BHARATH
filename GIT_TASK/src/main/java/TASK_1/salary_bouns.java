package TASK_1;

import java.util.Scanner;

public class salary_bouns 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sal");
		int sal=sc.nextInt();
		System.out.println("enter the year");
		int year=sc.nextInt();
		sc.close();
		float bouns;
		
		if(year>5)
		{
			bouns=(float)5/100*sal;
			System.out.println("then he will give bouns");
			System.out.println(bouns);
		}
		else
		{
			System.out.println("then he will not give bouns");
		}

}
}
