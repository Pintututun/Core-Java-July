package classNotes_Multithreading;

public class RailwayReservationUsingLambda {
	private int available = 1;	
	private int wanted;

	public RailwayReservationUsingLambda(int wanted)
	{
        this.wanted = wanted;		
	}

	public static void main(String[] args) 
	{
		RailwayReservationUsingLambda rr = new RailwayReservationUsingLambda(1);
		
		Runnable r1 = ()->
		{
			String name = null;
			if(rr.available >= rr.wanted)
			{
				name = Thread.currentThread().getName();
				System.out.println(rr.wanted +" berth reserved for :"+name);
				rr.available = rr.available - rr.wanted;
			}
			else
			{
				System.out.println("Hello "+name+" Sorry !! Berth is not available");
			}
		};
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.setName("Person1");
        t2.setName("Person2");  t1.start(); t2.start();
	}
}
