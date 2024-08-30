package classNotes_Multithreading;

class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" thread is running.....");	
	}
}
public class ThreadName1 
{
	public static void main(String[] args) 
	{
		 Thread t = Thread.currentThread();
	     t.setName("Parent");//changing the main thread name
			     
	     Demo d1 = new Demo();
	     Demo d2 = new Demo();
	     
	     d1.setName("Child1");
	     d2.setName("Child2");	
	     
	     d1.start();
	     d2.start();  
	     
	          
	     System.out.println(Thread.currentThread().getName()+" thread is running...");
	}
}
