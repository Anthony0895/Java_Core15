package lgs;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println ("Enter 1 to add a new member of the zoo club");
		System.out.println ("Enter 2 to add the animal to the zoo club member");
		System.out.println ("Enter 3 to remove the animal from the zoo club member");
		System.out.println ("Enter 4 to remove a member from the zoo club");
		System.out.println ("Enter 5 to remove the entered animal from all zoo club members");
		System.out.println ("Enter 6 to display the zoo club");
		System.out.println ("Enter 0 to exit the program");
	}
	
	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();
		String sc, sc1;

		while (true) {
			menu();
			sc = new Scanner(System.in).nextLine();
			switch (sc) {

			case "1": { 
				System.out.print("Введіть (через пробіл) Імя та Вік учасника: ");
				String sс = new Scanner(System.in).nextLine();
				String[] s = sс.split(" ");

				if (!ZooClub.addClubMember(new Person(s[0], Integer.parseInt(s[1])))) {
					System.out.println(
							"Помилка додавання учасника клубу " + sc + " Скоріше за все такий учасник уже існує!");
				} else {
					System.out.println("Учасник " + sc + " успішно доданий!");
				}
				break;
			} 
			case "2": { 
				System.out.print("Введіть Імя учасника клубу ");
				sc = new Scanner(System.in).nextLine();
				System.out.print("Введіть (через пробіл) Тип та Імя тварини  ");
				sc1 = new Scanner(System.in).nextLine();
				String[] s = sc1.split(" ");
				if (!ZooClub.addAnimal(sc, new Animal(s[0], s[1]))) {
					System.out.println("Помилка додавання тварини до учасника клубу " + sc
							+ " Скоріше за все учасника не знайдено!");
				} else {
					System.out.println("Тварина " + sc1 + " успішно додана учаснику " + sc);
				}
				break;
			} 
			case "3": { 
				System.out.print("Введіть (через пробіл) Імя учасника клубу та Імя тварини: ");
				sc = new Scanner(System.in).nextLine();
				String[] s = sc.split(" ");

				if (!ZooClub.removeAnimal(s)) {
					System.out.println("Помилка видалення тварини " + s[1] + " учасника " + s[0]
							+ " скоріш за все помилковий ввід імен");
				} else {
					System.out.println("Тварина " + s[1] + " успішно видалена в учасника " + s[0]);
				}
				break;
			} 
			case "4": { 
				System.out.print("Введіть Імя учасника клубу: ");
				sc = new Scanner(System.in).nextLine();
				if (!ZooClub.removeClubMember(sc)) {
					System.out.println("Помилка видалення учасника " + sc + " .Скоріш за все такого учасника немає");
				} else {
					System.out.println("Учасник " + sc + " успішно видалений з клубу");
				}
				break;
			} 
			case "5": { 
				System.out.print("Введіть Імя тварини: ");
				sc = new Scanner(System.in).nextLine();
				if (!ZooClub.removeAnimalFromAllMembers(sc)) {
					System.out.println("Помилка видалення тварини " + sc + " скоріш за все помилковий ввід імен");
				} else {
					System.out.println("Тварина " + sc + " успішно видалена ");
				}

				break;
			} 
			case "6": { 
				ZooClub.displayZooClub();
				break;
			} 
			case "0": { 
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Please enter a number between 0 and 6!");
				break;
			}
			}
		}		

	}
	
	
}
