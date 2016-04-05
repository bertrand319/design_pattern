package proxy;


public class ProfessionalProxy implements ITask {
	
	private AndroidEngineer engineer = new AndroidEngineer();

	public void doTask() {
		System.out.println("set up the architecture");
		engineer.doTask();
		System.out.println("review the code");
	}

}
