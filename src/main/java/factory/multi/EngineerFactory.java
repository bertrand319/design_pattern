package factory.multi;

import factory.simple.AndroidEngineer;
import factory.simple.Engineer;

public class EngineerFactory {

	public Engineer generateAndroidEngineer() {
		return new AndroidEngineer();
	}
	
	public Engineer generateIOSEngineer() {
		return new AndroidEngineer();
	}
}
