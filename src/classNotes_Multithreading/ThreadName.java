package classNotes_Multithreading;

class Test extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running Here!!!!");
	}
}
public class ThreadName 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
		t1.start();			
		t2.start();	
		System.out.println(Thread.currentThread().getName()+" thread is running.....");
	}
}
