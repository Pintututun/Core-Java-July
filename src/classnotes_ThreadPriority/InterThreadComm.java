package classnotes_ThreadPriority;

class SecondThread extends Thread 
{
	    int x = 0;
	    @Override
		public void run() 
		{
			//Child Thread is waiting here for the lock
			synchronized(this) 
			{
				for(int i=1;i<=100;i++)
				{
					x =  x + i;
				}
				notify();  //will give notification to waiting thread
			}
	   }
}
public class InterThreadComm {
	public static void main(String [] args) 
	{
			SecondThread b = new SecondThread();  
			b.start();
			synchronized(b)  //lock is taken by main thread
				{
					//suspended
					try 
					{
						System.out.println("Waiting for b to complete...");
						System.out.println(Thread.currentThread().getName());
						b.wait();   // after releasing the lock, waiting here 
						System.out.println("Main thread Awake");
					} 
					catch (InterruptedException e)
					{
					}
					System.out.println("Value is: " + b.x);
				}		
		}
}
