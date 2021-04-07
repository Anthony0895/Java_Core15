package lgs;

public class Animal {

	private String Animaltype;
	private String Animalname;
	
	public Animal(String animaltype, String animalname) {
		super();
		Animaltype = animaltype;
		Animalname = animalname;
	}
	public String getAnimaltype() {
		return Animaltype;
	}
	public void setAnimaltype(String animaltype) {
		Animaltype = animaltype;
	}
	public String getAnimalname() {
		return Animalname;
	}
	public void setAnimalname(String animalname) {
		Animalname = animalname;
	}
	@Override
	public String toString() {
		return "Animal [Animaltype=" + Animaltype + ", Animalname=" + Animalname + "]";
	}
	
	
}
