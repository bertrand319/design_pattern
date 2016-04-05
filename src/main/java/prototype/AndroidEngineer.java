package prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AndroidEngineer implements Cloneable {
	
	private List<String> masterTechs;
	
	public AndroidEngineer() {
		masterTechs = new ArrayList<String>();
	}
	
	public void addMasterTechs(String techs) {
		masterTechs.add(techs);
	}
	
	public void printMasterTechs() {
		for (String string : masterTechs) {
			System.out.println(string);
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		AndroidEngineer engineer = new AndroidEngineer();
		for (String string : masterTechs) {
			engineer.masterTechs.add(string);
		}
		return engineer;
	}
	
	

}
