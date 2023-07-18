package TASK_1;

public class exception 
{
	public static void main(String[] args)  
	  {
		 m1();
	  }
	  
	  static void m1()
	  {
		  System.out.println("program start");
		   int a=5;
		   int b=0;
		   int result = 0;
		   
		   try 
		   {
			   result=a/b;
		   }
		   catch(ArithmeticException c)
		   {
			   System.out.println(c.toString());
		   }  
		   finally 
		   {
			   System.out.println();
			System.out.println("Finally block");
	       }
		   
		   System.out.println();
		   System.out.println("out put is" + " = " + result);
		   
		   System.out.println("program end");  
	  }
}
