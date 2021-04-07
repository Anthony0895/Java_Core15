package lgs;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String personname;
	private int personage;
	List<Animal> animal = new ArrayList<>();
	public Person(String personname, int personage) {
		this.personname = personname;
		this.personage = personage;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public int getPersonage() {
		return personage;
	}
	public void setPersonage(int personage) {
		this.personage = personage;
	}
	
	
	public List<Animal> getAnimal() {
		return animal;
	}
	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}
	@Override
	public String toString() {
		return "Person [personname=" + personname + ", personage=" + personage + "]";
	}
	
	
	
}
