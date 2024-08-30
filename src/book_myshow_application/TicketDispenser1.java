package book_myshow_application;
public class TicketDispenser1
{
	static  int maximumSeat=200;
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