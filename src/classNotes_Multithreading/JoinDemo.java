package classNotes_Multithreading;


class Join extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i + " By "+ Thread.currentThread().getName());
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
		      e.printStackTrace();		
			}
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main Thread Started!!!!!");
       
       Join j1 = new Join();
       Join j2 = new Join();
       Join j3 = new Join();
       j1.setName("Account_Opening");
       j2.setName("Deposit");
       j3.setName("Withdraw");
       
       j1.start();        
       j1.join(); //main thread will halt here       
       j2.start();        
       j2.join();  //main thread will halt here        
       j3.start();       
       j3.join();  //main thread will halt here   
       
       System.out.println("Main thread completed!!!!");
       
	}
}
