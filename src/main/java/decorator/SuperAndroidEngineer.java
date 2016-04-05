package decorator;

public class SuperAndroidEngineer {
	
	private AndroidEngineer engineer;
	
	public SuperAndroidEngineer(AndroidEngineer engineer) {
		// TODO Auto-generated constructor stub
		this.engineer = engineer;
	}
	
	public void writeJ2EECode() {
		System.out.println("write j2ee code");
	}
	
	public void writeAndroidCode() {
		engineer.writeAndroidCode();
	}

}
