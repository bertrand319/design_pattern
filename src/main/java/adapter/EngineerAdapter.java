package adapter;

public class EngineerAdapter<T> {

	private T engineer;
	
	public EngineerAdapter(T engineer) {
		this.engineer = engineer;
	}
	
	public void lastStep() {
		if(engineer instanceof AndroidEngineer) {
			((AndroidEngineer) engineer).publishing();
		}else if(engineer instanceof ServerEngineer){
			((ServerEngineer) engineer).deploy();
		}else {
			System.err.println("Can't find the class");
		}
	}
}
