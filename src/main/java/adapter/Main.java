package adapter;

public class Main {

	public static void main(String[] args) {
		EngineerAdapter<AndroidEngineer> adapter1 
			= new EngineerAdapter<AndroidEngineer>(new AndroidEngineer());
		adapter1.lastStep();
		
		EngineerAdapter<ServerEngineer> adapter2 
			= new EngineerAdapter<ServerEngineer>(new ServerEngineer());
		adapter2.lastStep();
	}
}
