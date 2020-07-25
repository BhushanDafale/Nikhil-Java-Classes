package tutorial.java.enumdemo;

public enum Level {
	
	LOW(1), MIDEUM(5), HIGH(10);
	
	public final int level;
	
	private Level(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
}
