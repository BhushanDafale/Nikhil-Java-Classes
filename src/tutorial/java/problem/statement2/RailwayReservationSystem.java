package tutorial.java.problem.statement2;

import java.util.Scanner;

public class RailwayReservationSystem {

	private static final int EXIT = 4;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.err.print("How many bookings? -> ");
		int bookingCount = scan.nextInt();
		
		Booking[] bookings = new Booking[bookingCount];
		System.out.println("Accepated Bookings: " + bookings.length);
		
		System.out.println("---------------------------------");
		
		int option = 0;
		
		do {
			System.out.println("****Resvation Options: ");
			System.out.println("    1. NEW\n    2. CANCEL\n    3. SHOW\n    4. EXIT");
			
			System.out.print("Please enter your choice -> ");
			option = scan.nextInt();
			
			switch (option) {
			case 1:
				BookingSystem.startNewBooking(bookings);
				break;
			case 2:
				BookingSystem.cancelBooking();
				break;
			case 3:
				BookingSystem.showBooking();
				break;
			case 4:
				System.out.println("--> Exit");
				break;
			default:
				System.err.println("-- Wrong option entered");
				break;
			}
		} while(option != EXIT);
				
		System.err.println("--------------Reservation is completed-------------");
	}

}
