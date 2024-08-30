package classNotes_Multithreading;

class DemoName extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" thread is running.....");	
	}
}
public class ThreadNameUsingChild1AndChild2 {
	public static void main(String[] args) 
	{
		 Thread t = Thread.currentThread();
	     t.setName("Parent");//changing the main thread name
			     
	     DemoName d1 = new DemoName();
	     DemoName d2 = new DemoName();
	     
	     
	     d1.setName("Child1");
	     d2.setName("Child2");	
	     
	     d1.start();
	     d2.start();  
	     
	          
	     System.out.println(Thread.currentThread().getName()+" thread is running...");
	}
}
