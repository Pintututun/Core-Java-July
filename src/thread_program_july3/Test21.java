package thread_program_july3;

public class Test21 extends Thread
{
	static Thread t;
	public static void main(String [] args)
	{
		try
		{
			t=new Thread(new Test21(),"Ravi");
			t.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		for(int i=1; i<5; i++)
		{
			try
			{
				System.out.print(Thread.currentThread().getName()+"");
				t.start();
			}
			catch (Exception e)
			{
				System.out.println(" will not botther about but "+e+" happened "+i+" times");
			}
		}
	}
}
