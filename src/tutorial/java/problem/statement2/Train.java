package tutorial.java.problem.statement2;

import java.util.Date;

public class Train {

	private int number;
	private String name;
	private Date arrival;
	private Date departure;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", arrival=" + arrival + ", departure=" + departure + "]";
	}

}
