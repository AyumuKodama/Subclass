
public class Invertebrate extends Animal {

	private String eat;
	
	public Invertebrate(String commonName, String group, String subgroup, String food) {
		super(commonName, group, subgroup);
		eat = food;
	}
	
	public void setEat(String food) {
		eat = food;
	}
	
	public String getEat(String food) {
		return eat;
	}

}
