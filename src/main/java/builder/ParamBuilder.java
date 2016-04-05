package builder;

public class ParamBuilder {
	
	private StringBuffer sb;

	public ParamBuilder() {
		sb = new StringBuffer();
	}
	
	public ParamBuilder version(String version) {
		sb.append("version=").append(version).append('&');
		return this;
	}
	
	public ParamBuilder deviceId(String deviceId) {
		sb.append("deviceId=").append(deviceId).append('&');
		return this;
	}
	
	public ParamBuilder os(String os) {
		sb.append("os=").append(os).append('&');
		return this;
	}

	@Override
	public String toString() {
		if(sb.length()>0) {
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
	
	
}
