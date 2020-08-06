package tutorial.java.problem.statement2;

public enum Coach {
	
	FIRSTCLASS("1A"),
	SECONDCLASS("2A"),
	THIRDCLASS("3A"),
	SL,
	OTHER;
	
	private String coach;
	
	private Coach() {
	}
	
	private Coach(String coach) {
		this.coach = coach;
	}

	public String getCoach() {
		return coach;
	}
	
}
