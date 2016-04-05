package factory.simple;

public class EngineerFactory {

	public Engineer generateEngineer(String type) {
		if(type.equalsIgnoreCase("android")) {
			return new AndroidEngineer();
		}else if(type.equalsIgnoreCase("ios")) {
			return new IOSEngineer();
		}else {
			System.out.println("Please input correct type");
			return null;
		}
	}
}
