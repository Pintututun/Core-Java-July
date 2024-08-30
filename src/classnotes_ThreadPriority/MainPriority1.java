package classnotes_ThreadPriority;

class ThreadP extends Thread
{
	@Override
	public void run()
	{
	  int priority = Thread.currentThread().getPriority(); 
	  
	  System.out.println("Child Thread priority is :"+priority);  
	  
	}
}
public class MainPriority1 {
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		
		//t.setPriority(11);  java.lang.IllegalArgumentException
		
		System.out.println("Main thread priority is :"+t.getPriority()); 		
		
		ThreadP t1 = new ThreadP();
		t1.start();		
	}
}
