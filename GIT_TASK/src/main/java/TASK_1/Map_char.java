package TASK_1;

import java.util.HashMap;
import java.util.Map;

public class Map_char 
{
	public static void main(String[] args) 
	{
		Map<Character,Integer> g=new HashMap<Character,Integer>();

		String s="bharathkumar";
		char[] str=s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			char x=str[i];
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

		for(Character value:g.keySet())
		{
			System.out.println(value+ " repeted " + g.get(value) + " times ");
		}
	}
}
