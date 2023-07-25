package TASK_1;

public class new_method_funcation 
{
	public static void am()
	{
		int n=1000;  
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				int count=0; int sum1=0; int temp=i,temp2=i;
				int rem=0; int v=0;
				while(temp>0)
				{
					temp=temp/10;
					count++;
				}
				while(temp2>0)
				{
					int b=1;
					rem=temp2%10;

					for(int k=1;k<=count;k++)
					{
						b=b*rem;
					}
					v=v+b;
					temp2=temp2/10;
				}

				if(v==i)
				{
					int temp1=i,mov=0,rev=0;
					while(temp1>0)
					{
						int rem1=temp1%10;
						mov=rev*10;
						rev=rem1+mov;
						temp1=temp1/10;
					}
					if(rev==i)
					{
						System.out.println("then given number palli and amstrong and perfect " + i);
					}

				}
			}

		}
	}
	public static void am1(int n)
	{  
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				int count=0; int sum1=0; int temp=i,temp2=i;
				int rem=0; int v=0;
				while(temp>0)
				{
					temp=temp/10;
					count++;
				}
				while(temp2>0)
				{
					int b=1;
					rem=temp2%10;

					for(int k=1;k<=count;k++)
					{
						b=b*rem;
					}
					v=v+b;
					temp2=temp2/10;
				}

				if(v==i)
				{
					int temp1=i,mov=0,rev=0;
					while(temp1>0)
					{
						int rem1=temp1%10;
						mov=rev*10;
						rev=rem1+mov;
						temp1=temp1/10;
					}
					if(rev==i)
					{
						System.out.println("then given number palli and amstrong and perfect " + i);
					}

				}
			}

		}
	}
  public static void main(String[] args) {
	am();
	am1(1000);
}
}
