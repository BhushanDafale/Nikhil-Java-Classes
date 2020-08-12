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
			int id = 1;
			
			booking.setTrain(train);
			booking.setBookingId("1:booking");
			booking.setBookingOn(new Date());
			booking.setCoach(Coach.FIRSTCLASS.getCoach());
			booking.setStatus(BookingStatus.BOOKED);
			booking.setPnr(nextPnr);
			
			System.out.print("Passenger Count? (Max 4 allowed) -> ");
			int passengerCount = scan.nextInt();
			Passenger[] passengers = new Passenger[passengerCount];


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
			nextPnr++;
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

	public static void showBooking(Booking[] bookings) {
		System.err.print("------------------------------------");
		System.out.print("\nEnter PNR -> ");
		int pnr = scan.nextInt();
		
		boolean flag = false;
		
		for (Booking booking : bookings) {
			if(booking != null && pnr == booking.getPnr()) {				
				Train train = booking.getTrain();
				System.out.println("Train No: " + train.getNumber() + ", Train Name: " + train.getName());
				System.out.println("Arrival: " + train.getArrival() + ", Departure: " + train.getDeparture());
				System.out.println("_______________________________________________");
				
				System.out.println("PNR: " + booking.getPnr() + ", Booking Status: " + booking.getStatus());
				System.out.println("_______________________________________________");
				
				Passenger[] passengers = booking.getPassenger();
				for(Passenger passenger : passengers) {
					System.out.println(passenger.getId() + " Passenger Details------");
					System.out.println("Name: " + passenger.getName() + ", Gender: " + passenger.getGender());
					System.out.println("Age: " + passenger.getAge() + ", Seat No: " + passenger.getSeatNumber());
					System.out.println("Status: " + passenger.getBookingStatus());
				}
				
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.err.println("-----Invalid PNR number-----");
		}
		System.out.println("*******************************************************");
	}

}
