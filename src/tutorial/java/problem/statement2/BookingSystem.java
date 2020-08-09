package tutorial.java.problem.statement2;

import java.util.Date;
import java.util.Scanner;

public abstract class BookingSystem extends BookingWorkflow {

	private static Scanner scan = new Scanner(System.in);

	protected static void startNewBooking(Booking[] bookings) {
		Booking booking = new Booking();

		System.out.println("--------Available Trains---------");
		// create Train records
		Train[] trains = RecordUtility.getTrains();
		for (Train train : trains) {
			System.out.println("Train Number: " + train.getNumber() + ", Train Name: " + train.getName());
		}
		System.out.println("---------------------------------");

		System.out.print("Please enter your train number -> ");
		int trainNumber = scan.nextInt();
		Train train = getTrainInfo(trainNumber);
		if(train != null) {
			booking.setTrain(train);
			System.out.print("Passenger Count? (Max 4 allowed) -> ");
			int passengerCount = scan.nextInt();
			Passenger[] passengers = new Passenger[passengerCount];

			int id = 1;

			while (passengerCount != 0) {
				Passenger passenger = new Passenger();
				passenger.setId(id);
				passenger.setBookedOn(new Date());
				passenger.setBookingStatus(BookingStatus.BOOKED);
				passenger.setSeatNumber(id + ":seat");

				System.out.print("Enter " + id + " passenger name: ");
				String name = scan.next();
				passenger.setName(name);

				System.out.print("Enter " + id + " passenger age: ");
				int age = scan.nextInt();
				passenger.setAge(age);
				
				System.out.print("Enter " + id + " passenger gender: ");
				String gender = scan.next();
				passenger.setGender(gender.charAt(0));
				
				Address address = new Address();
				passenger.setAddress(address);

				passengers[id - 1] = passenger;
				
				id++;
				passengerCount--;
			}		
			booking.setPassenger(passengers);
			
			bookings[nextBookingindex] = booking;
			nextBookingindex++;
		} else {
			System.err.println("------Invalid train number------");
		}
	}

	private static Train getTrainInfo(int trainNumber) {
		Train train = null;
		
		Train[] trains = RecordUtility.getTrains();
		for (Train t : trains) {
			if(trainNumber == t.getNumber()) {
				train = new Train();
				train.setNumber(trainNumber);
				train.setName(t.getName());
				train.setDeparture(t.getDeparture());
				train.setArrival(t.getArrival());
				
				break;
			}
		}
		
		return train;
	}

	protected static void cancelBooking() {
		System.out.println("-- cancel");
	}

	public static void showBooking() {
		System.out.println("-- Show");
	}

}
