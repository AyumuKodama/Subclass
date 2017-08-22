
public class Tester {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Human", "Homo", "sapiens");
		Animal animal2 = new Animal("Asian elephant", "Elephas", "maximus");
		Vertebrate vertebrate1 = new Vertebrate("Arizona coral snake", "Micruroides", "euryxanthus", "Reptile");
		Vertebrate vertebrate2 = new Vertebrate("Brown falcon", "Falco", "berigora", "Bird");
		Invertebrate invertebrate1 = new Invertebrate("Salmon pink tarantula", "Lasiodora", "parahybana", "Birds, insects");
		Invertebrate invertebrate2 = new Invertebrate("Giant Pacific octopus", "Enteroctopus", "dofleini", "Shrimp, fish");
		
		animal1.getAnimalInfo();
		System.out.println();
		animal2.getAnimalInfo();
		System.out.println();
		vertebrate1.getAnimalInfo();
		System.out.println("Type - " + vertebrate1.getType());
		System.out.println();
		vertebrate2.getAnimalInfo();
		System.out.println("Type - " + vertebrate2.getType());
		System.out.println();
		invertebrate1.getAnimalInfo();
		System.out.println("Food - " + invertebrate1.getEat(null));
		System.out.println();
		invertebrate2.getAnimalInfo();
		System.out.println("Food - " + invertebrate2.getEat(null));
	}
	
}
