package classNotes_Multithreading;

class MyThread extends Thread
{
	@Override
	public void run()
	{
      System.out.println("Child Thread is Running Here!!!!");		
	}
}
public class UserDefinedThread {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread has started!!!!");
		MyThread mt = new MyThread();		
		mt.start(); //calling the run()		        
		System.out.println("Main Thread has ended!!!!!!");
	}
}
