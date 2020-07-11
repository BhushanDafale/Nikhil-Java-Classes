package java.fun.part2;

public abstract class Animal {
	
	public String color;
	public String bread;
	public short age;
	public double weight;
	
	public String info() {
		return "color: " + color + ", bread: " + bread + ", age: " + age + ", weight: " + weight;
	}

}