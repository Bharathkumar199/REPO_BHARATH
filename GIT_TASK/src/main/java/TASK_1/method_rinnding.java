package TASK_1;

import java.util.Scanner;

public class method_rinnding 
{
      public static void main(String[] args) 
    {
    	        Scanner sc=new Scanner(System.in);
    			System.out.println("enter the size of array");
    			int n=sc.nextInt();
    			System.out.println("enter the elements");
    			int arr[]=new int[n];
    			int count=0;
    			//int sum=0;
    			int x=arr.length-1;
    			for(int i=0;i<n;i++)
    			{
    				arr[i]=sc.nextInt();
    			}
    			for(int j=0;j<n;j++)
    			{
    				if(arr[j]==arr[x])
    				{
    					count++;
    				}
    				x--;
    			}
    			
    			if(count==n)
    			{
    				System.out.println("then it is pallindrome");
    			}
    			else
    			{
    				System.out.println("then it is not pallindrome");
    			}
    		}
	}

