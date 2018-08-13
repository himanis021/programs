import java.util.*;
class th implements Runnable
{
	
	public void run()
	{
		int f=0;
		try
		{
		while(true)
			{
			String name="himani";
			System.out.print("\r");
			for(int i=0;i<=f;i++)
			{

				System.out.print("\t");
			}
			System.out.print(name);
			f++;
			Thread.sleep(1000);
			}
		
		}

		catch(Exception e)
		{
		System.out.print(e.getMessage());
		
		}

	}		

	public static void main(String ar[])
	{
		th t=new th();
		Thread th=new Thread(t);
		th.start();
	}

}
