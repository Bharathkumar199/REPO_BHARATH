package TASK_1;

import java.util.HashMap;
import java.util.Map;

public class Map_first_Class 
{
	public static void main(String[] args) 
	{
		Map<Integer,Integer> g=new HashMap<Integer,Integer>();
		int arr[]=new int[5];
		g.put(10, 1);
		g.put(20, 1);
		g.put(30, 1);
		g.put(30, 2);
		g.put(68, 1);
		for(int i=0;i<arr.length-1;i++)
		{
			int x=arr[i];
			if(g.keySet().contains(x))
			{
				int temp=g.get(x);
				temp=temp+1;
				g.put(x,temp);
			}
			else
			{
				g.put(x,1);
			}
		}

		for(int value:g.keySet())
		{
			System.out.println(value+ " repeated " + g.get(value));
		}
	}
}
