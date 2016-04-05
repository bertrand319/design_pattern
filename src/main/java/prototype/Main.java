package prototype;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		AndroidEngineer engineer1 = new AndroidEngineer();
		engineer1.addMasterTechs("design pattern");
		engineer1.addMasterTechs("view animation");
		
		AndroidEngineer engineer2 = (AndroidEngineer) engineer1.clone();
		engineer2.printMasterTechs();
		
	}

}
