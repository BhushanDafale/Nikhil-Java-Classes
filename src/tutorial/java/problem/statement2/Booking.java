package tutorial.java.problem.statement2;

import java.util.Date;

public class Booking {

	private int bookingId;
	private int pnr;
	private Date bookingOn;
	private BookingStatus status;
	private Date canceledOn;
	private Passenger[] passengers;
	private Train train;
	private Coach coach;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public Date getBookingOn() {
		return bookingOn;
	}

	public void setBookingOn(Date bookingOn) {
		this.bookingOn = bookingOn;
	}

	public BookingStatus getStatus() {
		return status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}

	public Date getCanceledOn() {
		return canceledOn;
	}

	public void setCanceledOn(Date canceledOn) {
		this.canceledOn = canceledOn;
	}

	public Passenger[] getPassenger() {
		return passengers;
	}

	public void setPassenger(Passenger[] passengers) {
		this.passengers = passengers;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", pnr=" + pnr + ", bookingOn=" + bookingOn + ", status=" + status
				+ ", canceledOn=" + canceledOn + ", passengers=" + passengers + ", train=" + train + ", coach=" + coach
				+ "]";
	}

}
