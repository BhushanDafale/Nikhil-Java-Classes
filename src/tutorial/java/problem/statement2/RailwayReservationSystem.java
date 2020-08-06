package tutorial.java.problem.statement2;

import java.util.Scanner;

public class RailwayReservationSystem {

	private static int nextBookingindex = 0;
	private static final int EXIT = 4;
	
	public static void main(String[] args) {
		
		System.out.println("--------Available Trains---------");
		// create Train records
		Train[] trains = RecordUtility.getTrains();
		for (Train train : trains) {
			System.out.println("Train Number: " + train.getNumber());
		}
		System.out.println("---------------------------------");
		
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
			
		} while(option != EXIT);
				
		System.err.println("--------------Reservation is completed-------------");
	}

}
