package singleton;

import java.util.ArrayList;
import java.util.List;

public class AndroidEngineer {
	
	private static AndroidEngineer engineer;
	
	private List<String> tasks;
	
	public synchronized static AndroidEngineer getInstance() {
		if(null == engineer) {
			engineer = new AndroidEngineer();
			engineer.tasks = new ArrayList<String>();
		}
		return engineer;
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	

}
