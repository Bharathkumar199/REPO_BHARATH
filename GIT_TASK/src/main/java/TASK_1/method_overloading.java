package TASK_1;

public class method_overloading 
{
	void send(int no) 
	{
		System.out.println();
		System.out.println("the number is : " + no);
	}
	void send(String txt)
	{
		System.out.println();
		System.out.println("the string txt is : " + txt);
	}
	void send(int no,String txt)
	{
		System.out.println();
		System.out.println("number and string is : " + no + " " + txt);
	}


	public static void main(String[] args) 
	{  
		method_overloading  n=new method_overloading ();
		n.send(50); 
		n.send("fish");
		n.send(99,"varun");
	}

}
