package composite;

public abstract class Component {
	
	public void add(Component component){};
	
	public void remove(Component component) {}
	
	public abstract void doTask();

}
