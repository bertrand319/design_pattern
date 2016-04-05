package factory;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		int a = Integer.valueOf("123");
		Class<?> clazz = Class.forName("java.lang.String");
	}
}
