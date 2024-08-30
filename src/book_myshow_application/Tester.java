package book_myshow_application;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of tickets--");
		int totalTicket = sc.nextInt();
		System.out.print("Enter the number of counter--");
		int numOfCounter = sc.nextInt();
		int ticketPerCounter = totalTicket / numOfCounter;
		TicketDispenser1 ticket = new TicketDispenser1();
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < ticketPerCounter; i++) {
					int seat = ticket.allotSeatNumber();
					if (seat != -1) {
						System.out.println(seat + " booked by " + Thread.currentThread().getName());
					}
				}
			}
		};
		Thread[] th = new Thread[numOfCounter];
		for (int i = 0; i < th.length; i++) {
			th[i] = new Thread(r);
			
		}
		for (Thread t : th) {
			t.start();
			t.join();
		}
		if (ticket.allotSeatNumber() != -1) {
			System.out.println(TicketDispenser1.maximumSeat - totalTicket + " seats available .");
		} else {
			System.out.println("Seats not available");
		}
			}
}
