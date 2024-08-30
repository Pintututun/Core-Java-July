package thread_ticket_program_july5;

import java.util.Scanner;

public class Tester {
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of seats:");
	int numberSeat=sc.nextInt();
	TicketDispenser t=new TicketDispenser();
	Runnable r=new Runnable()
			{
		public void run()
		{
			int seat=t.allotSeatNumber();
			if(seat!=-1)
			{
				System.out.println(seat +" booked by "+Thread.currentThread().getName());
			}
		}
			};
			Thread[] t1=new Thread[numberSeat];
			for(int i=0;i<numberSeat;i++)
			{
				t1[i]=new Thread(r);
			}
			for(Thread ticket:t1)
			{
				ticket.start();
				ticket.join();
			}
			if(t.allotSeatNumber()!=-1)
			{
				System.out.println(TicketDispenser.maximumSeat-numberSeat+" seats are Available");
			}
			else
			{
				System.out.println("No Seats available");
			}
			
	
}
}
