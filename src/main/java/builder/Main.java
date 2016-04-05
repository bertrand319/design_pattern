package builder;

public class Main {

	public static void main(String[] args) {
		ParamBuilder builder = new ParamBuilder();
		builder.deviceId("123").os("android").version("1.0.0");
		System.out.println(builder);
	}
}
