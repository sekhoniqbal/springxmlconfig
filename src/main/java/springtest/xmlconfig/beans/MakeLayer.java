package springtest.xmlconfig.beans;

public class MakeLayer implements Layer {
	
	private String name;
	public MakeLayer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}


}
