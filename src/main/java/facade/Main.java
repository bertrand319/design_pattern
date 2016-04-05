package facade;

public class Main {
	
	public static void main(String[] args) {
		DevelopmentFacade facade = new DevelopmentFacade();
		
		facade.design();
		facade.code();
		facade.test();
	}

}
