package lgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	 static Map<Person, ArrayList<Animal>> ZooClub = new HashMap<Person, ArrayList<Animal>>();

	public Map<Person, ArrayList<Animal>> getZooClub() {
		return ZooClub;
	}

	public void setZooClub(Map<Person, ArrayList<Animal>> zooClub) {
		ZooClub = zooClub;
	}

	public static boolean addClubMember(Person p) {
		boolean b = true;
		for (Person p1 : ZooClub.keySet()) {
			if (p.getPersonname().equalsIgnoreCase(p.getPersonname())) {
				b = false;
			}
			if (b) {
				ZooClub.put(p, (ArrayList<Animal>) p.getAnimal());
			}
		}
		return b;
	}

	public static boolean addAnimal(String Personname, Animal animal1) {
		boolean b = false;
		for (Person p : ZooClub.keySet()) {
			if (p.getPersonname().equalsIgnoreCase(Personname)) {
				p.animal.add(animal1);
				b = true;
			}
		}
		return b;
	}

	public static boolean removeAnimal(String[] s) {
		boolean b = false;
		for (Person p : ZooClub.keySet()) {
			if (p.getPersonname().equalsIgnoreCase(personname)) {
				Iterator<Animal> anim = p.animal.iterator();
				while (anim.hasNext()) {
					if (anim.next().getAnimalname().equalsIgnoreCase(s)) {
						anim.remove();
						b = true;
					}
				}
			}

		}
		return b;

	}

	public static boolean removeClubMember(String Personname) {
		boolean b = false;
		Iterator<Person> pers = ZooClub.keySet().iterator();
		while (pers.hasNext()) {
			if (pers.next().getPersonname().equalsIgnoreCase(Personname)) {
				pers.remove();
				b = true;
			}
		}

		return b;

	}

	public static boolean removeAnimalFromAllMembers(String Animalname) {
		boolean b = false;
		for (Person p : ZooClub.keySet()) {
			Iterator<Animal> anim = p.animal.iterator();
			while (anim.hasNext()) {
				if (anim.next().getAnimalname().equalsIgnoreCase(Animalname)) {
					anim.remove();
					b = true;
				}
			}
		}

		return b;

	}

	public static void displayZooClub() {
		Collection<Entry<Person,ArrayList<Animal>>> entrySet = ZooClub.entrySet();
		for (Entry<Person, ArrayList<Animal>> entry : entrySet) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
	}

