
public class Animal {

	private String name;
	private String genus;
	private String species;
	
	public Animal(String commonName, String group, String subgroup) {
		name = commonName;
		genus = group;
		species = subgroup;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenus() {
		return genus;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void getAnimalInfo() {
		System.out.println(name + " - " + genus + " " + species);
	}
}
