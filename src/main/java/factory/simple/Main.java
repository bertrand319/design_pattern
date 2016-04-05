package factory.simple;

public class Main {

	public static void main(String[] args) {
		EngineerFactory factory = new EngineerFactory();
		Engineer engineer = factory.generateEngineer("android");
		engineer.writeCode();
	}
}
