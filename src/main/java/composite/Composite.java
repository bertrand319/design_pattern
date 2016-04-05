package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> employees;
	
	public Composite() {
		// TODO Auto-generated constructor stub
		employees = new ArrayList<Component>();
	}
	
	
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		employees.add(component);
	}


	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		employees.remove(component);
	}



	@Override
	public void doTask() {
		for (Component component : employees) {
			component.doTask();
		}
	}

}
