
public class Vertebrate extends Animal {

	private String type;
	
	public Vertebrate(String commonName, String group, String subgroup, String classification) {
		super(commonName, group, subgroup);
		type = classification;
	}
	
	public void setType(String classification) {
		type = classification;
	}
	
	public String getType() {
		return type;
	}

	
}
