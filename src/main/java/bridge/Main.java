package bridge;

public class Main {

	public static void main(String[] args) {
		AbstractEngineer engineer1 = new AndroidEngineer(new JavaLanuage());
		engineer1.using();
		
		AbstractEngineer engineer2 = new IOSEngineer(new ObjectCLanguage());
		engineer2.using();
	}
}
