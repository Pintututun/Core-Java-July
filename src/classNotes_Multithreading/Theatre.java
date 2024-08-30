package classNotes_Multithreading;

class MyThreadType implements Runnable
{
	private String str;
	public MyThreadType(String str)
	{
		this.str=str;
	}	
	
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			System.err.println(e);
			}
		}
	}
}
public class Theatre {
	public static void main(String [] args)
	{
		MyThreadType obj1 = new MyThreadType("Cut the Ticket");
		MyThreadType obj2 = new MyThreadType("Allocate the Seat");

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}
