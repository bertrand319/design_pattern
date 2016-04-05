package flyweight;

import java.util.Map;

public class EngineerFactory {
	
	private Map<String, AbstractEngineer> engineerMap;
	
	public AbstractEngineer getEngineer(String name) {
		if(engineerMap.containsKey(name)) {
			return engineerMap.get(name);
		}else {
			AbstractEngineer engineer = null;
			if(name.equals("android")) {
				engineer = new AndroidEngineer();
			}else {
				engineer = new IOSEngineer();
			}
			engineerMap.put(name, engineer);
			return engineer;
		}
	}

}
