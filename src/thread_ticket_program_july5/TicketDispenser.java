package thread_ticket_program_july5;

public class TicketDispenser {
	static  int maximumSeat=100;
	 int allotedSeats=0;
	 
	 public synchronized int allotSeatNumber()
	 {
		
		   if(allotedSeats<maximumSeat)
		   {
			   allotedSeats++;
			   return allotedSeats;
		   }
		   else
		   {
			   return -1;
		   }
	 }
}
