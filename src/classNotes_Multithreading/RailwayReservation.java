package classNotes_Multithreading;


class Customer implements Runnable
{
	int available = 1;	
	int wanted;
	
	public Customer(int wanted)
	{
	  this.wanted = wanted;	
	}
	
	@Override
	public void run() 
	{
		if(available >= wanted)
		{
		String name = Thread.currentThread().getName();	
		System.out.println(wanted + " berth reserved for :"+name);
		available = available - wanted;
		}
		else
		{
			System.out.println("Sorry! Berth is not available");
		}
	}
	
}
public class RailwayReservation {
	public static void main(String[] args)  
	{
		Customer c1 = new Customer(1);
		
		Thread t1 = new Thread(c1);
		t1.setName("Person1");
		
		Thread t2 = new Thread(c1);
		t2.setName("Person2");
		
		t1.start(); 
		t2.start();
		
	}
}
