package factory.abs;

import factory.simple.AndroidEngineer;
import factory.simple.Engineer;

public class AndroidEngineerFactory extends AbstractEngineerFactory {

	@Override
	public Engineer generateEngineer() {
		// TODO Auto-generated method stub
		return new AndroidEngineer();
	}

}
