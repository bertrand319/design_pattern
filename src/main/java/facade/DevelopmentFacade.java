package facade;

public class DevelopmentFacade {
	
	private AndroidEngineer androidEngineer;
	private IOSEngineer iosEngineer;
	
	public DevelopmentFacade() {
		// TODO Auto-generated constructor stub
		androidEngineer = new AndroidEngineer();
		iosEngineer = new IOSEngineer();
	}

	public void design() {
		androidEngineer.design();
		iosEngineer.design();
	}
	
	public void code() {
		androidEngineer.code();
		iosEngineer.code();
	}
	
	public void test() {
		androidEngineer.test();
		iosEngineer.test();
	}
}
