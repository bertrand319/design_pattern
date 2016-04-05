package decorator;

public class Main {

	public static void main(String[] args) {
		AndroidEngineer androidEngineer = new AndroidEngineer();
		androidEngineer.writeAndroidCode();
		
		SuperAndroidEngineer superAndroidEngineer 
			= new SuperAndroidEngineer(androidEngineer);
		superAndroidEngineer.writeJ2EECode();
		
		FullStackEngineer fullStackEngineer = new FullStackEngineer(superAndroidEngineer);
		fullStackEngineer.writeHTMLCode();
	}
}
