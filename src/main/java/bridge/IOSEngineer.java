package bridge;

public class IOSEngineer extends AbstractEngineer {

	public IOSEngineer(AbstractLanguage language) {
		super(language);
	}

	@Override
	public void using() {
		super.using();
		System.out.println(" and XCode");
	}
	
	

}
