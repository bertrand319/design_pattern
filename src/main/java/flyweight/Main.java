package flyweight;

public class Main {
	
	public static void main(String[] args) {
		EngineerFactory factory = new EngineerFactory();
		
		factory.getEngineer("android").writeCode();
		factory.getEngineer("ios").writeCode();
	}

}
