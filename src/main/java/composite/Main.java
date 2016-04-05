package composite;

public class Main {

	public static void main(String[] args) {
		Component component1 = new Composite();
		component1.add(new IOSEngineer());
		component1.add(new AndroidEngineer());
		component1.doTask();
		
		System.out.println("==========");
		
		Component component2 = new AndroidEngineer();
		component2.doTask();
	}
}
