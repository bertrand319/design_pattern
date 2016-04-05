package bridge;

public abstract class AbstractEngineer {
	
	private AbstractLanguage language;
	
	public AbstractEngineer(AbstractLanguage language) {
		this.language = language;
	}
	
	public void using() {
		language.using();
	}

}
