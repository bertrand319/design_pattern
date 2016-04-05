package decorator;

public class FullStackEngineer {

	private SuperAndroidEngineer engineer;
	
	public FullStackEngineer(SuperAndroidEngineer engineer) {
		this.engineer = engineer;
	}
	
	public void writeHTMLCode() {
		System.out.println("write html code");
	}
	
	public void writeJ2EECode() {
		engineer.writeJ2EECode();
	}
	
	public void writeAndroidCode() {
		engineer.writeAndroidCode();
	}
}
