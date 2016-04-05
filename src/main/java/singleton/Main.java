package singleton;

public class Main {
	
	public static void main(String[] args) {
		AndroidEngineer engineer = AndroidEngineer.getInstance();
		engineer.addTask("write view animation");
		engineer.addTask("kill product manager");
	}

}
