package classnotes_synchronization_multithreading;

class Table 
{
	public synchronized void printTable(int num) 
	{
	  for(int i =1; i<=10; i++)
	  {		
	    try
	    {
	    	Thread.sleep(500);	
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    System.out.println(num+" X "+i+" = "+(num*i));
	  }
	}
}

public class SynchronizationMethod {
	public static void main(String[] args) 
	{
		Table t1 = new Table(); //t1 has a lock
		
		
		Runnable r1 = ()-> t1.printTable(5);
		
		Runnable r2 = ()-> t1.printTable(10);
		
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		thread1.start();  thread2.start();

	}
}
