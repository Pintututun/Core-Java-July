package classnotes_ThreadPriority;

class Customer
{  
     int balance=10000;    

	public synchronized void withdraw(int amount)   //amount = 15000
	{  
		System.out.println("going to withdraw...");    
		if(balance < amount)
			{  
				System.out.println("Less balance; waiting for deposit...");  
					try
					{
						wait();
					}
					catch(Exception e){}  
			}  
		balance  = balance - amount;
		System.out.println("withdraw completed..."+balance+" is remaining balance"); 
	}    

	public synchronized void deposit(int amount)  //amount =10000
		{  
			System.out.println("going to deposit...");  
			balance = balance + amount;  
			System.out.println("deposit completed... "); 
			System.out.println(balance);
			notify();  
		}  
}
public class InterThreadBalance {
	public static void main(String args[])
	{  
      Customer c=new Customer();    //lock is created here

		Thread t1 = new Thread()  //anonymous class concept
		{  
			@Override
			public void run()
			{
				c.withdraw(15000);
			}  
		};
		t1.start(); 		

		Thread t2 = new Thread()
		{  
			public void run()
			{
				c.deposit(10000);
			}  
		};
		
		t2.start();  
    }
}
