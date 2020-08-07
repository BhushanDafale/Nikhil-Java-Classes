package tutorial.java.problem.statement2;

import java.util.Date;

public abstract class RecordUtility {

	protected static Train[] getTrains() {
		Train[] trains = new Train[5];
		
		Train t1 = new Train();
		t1.setNumber(1234);
		t1.setName("ABC Train");
		t1.setArrival(new Date());
		t1.setDeparture(new Date());
		
		Train t2 = new Train();
		t2.setNumber(5678);
		t2.setName("DEF Train");
		t2.setArrival(new Date());
		t2.setDeparture(new Date());

		Train t3 = new Train();
		t3.setNumber(9012);
		t3.setName("GHK Train");
		t3.setArrival(new Date());
		t3.setDeparture(new Date());
		
		Train t4 = new Train();
		t4.setNumber(2345);
		t4.setName("LMO Train");
		t4.setArrival(new Date());
		t4.setDeparture(new Date());

		Train t5 = new Train();
		t5.setNumber(5432);
		t5.setName("PQR Train");
		t5.setArrival(new Date());
		t5.setDeparture(new Date());
		
		trains[0] = t1;
		trains[1] = t2;
		trains[2] = t3;
		trains[3] = t4;
		trains[4] = t5;
		
		return trains;
	}

}
