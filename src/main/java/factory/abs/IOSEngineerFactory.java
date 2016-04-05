package factory.abs;

import factory.simple.Engineer;
import factory.simple.IOSEngineer;

public class IOSEngineerFactory extends AbstractEngineerFactory {

	@Override
	public Engineer generateEngineer() {
		// TODO Auto-generated method stub
		return new IOSEngineer();
	}

}
