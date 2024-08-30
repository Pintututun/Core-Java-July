package classNotes_Multithreading;

class Stuff extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is Running!!!!");
	}
	
}
public class ExceptionDemo {

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Started");

		Stuff s = new Stuff(); s.start();
		Stuff s1 = new Stuff(); s1.start();
		
		System.out.println(10/0);
		System.out.println("Main Thread Ended");
	}
}

