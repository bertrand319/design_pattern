package factory.multi;

import factory.simple.Engineer;

public class Main {

	public static void main(String[] args) {
		EngineerFactory factory = new EngineerFactory();
		Engineer engineer = factory.generateAndroidEngineer();
		engineer.writeCode();
	}
}
