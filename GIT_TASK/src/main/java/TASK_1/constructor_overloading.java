package TASK_1;

public class constructor_overloading 
{
	
	public static void main(String[] args) 
	{
		new mainclass(10);
		new mainclass(50);
		new mainclass(50,99);
	}
}


class mainclass
{
	mainclass(int a)
	{
		System.out.println("int type....");
	}
	
	mainclass(double a)
	{
		System.out.println("double type....");
	}
	
	mainclass(int a,double b)
	{
		System.out.println("double and int type...");
	}
	
};

