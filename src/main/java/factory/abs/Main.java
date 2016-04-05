package factory.abs;

import factory.simple.Engineer;

public class Main {

	public static void main(String[] args) {
		AbstractEngineerFactory factory = new AndroidEngineerFactory();
		Engineer engineer = factory.generateEngineer();
		engineer.writeCode();
	}
}
