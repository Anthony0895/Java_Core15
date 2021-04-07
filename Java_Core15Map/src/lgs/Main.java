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
				System.out.print("������ (����� �����) ��� �� ³� ��������: ");
				String s� = new Scanner(System.in).nextLine();
				String[] s = s�.split(" ");

				if (!ZooClub.addClubMember(new Person(s[0], Integer.parseInt(s[1])))) {
					System.out.println(
							"������� ��������� �������� ����� " + sc + " ������ �� ��� ����� ������� ��� ����!");
				} else {
					System.out.println("������� " + sc + " ������ �������!");
				}
				break;
			} 
			case "2": { 
				System.out.print("������ ��� �������� ����� ");
				sc = new Scanner(System.in).nextLine();
				System.out.print("������ (����� �����) ��� �� ��� �������  ");
				sc1 = new Scanner(System.in).nextLine();
				String[] s = sc1.split(" ");
				if (!ZooClub.addAnimal(sc, new Animal(s[0], s[1]))) {
					System.out.println("������� ��������� ������� �� �������� ����� " + sc
							+ " ������ �� ��� �������� �� ��������!");
				} else {
					System.out.println("������� " + sc1 + " ������ ������ �������� " + sc);
				}
				break;
			} 
			case "3": { 
				System.out.print("������ (����� �����) ��� �������� ����� �� ��� �������: ");
				sc = new Scanner(System.in).nextLine();
				String[] s = sc.split(" ");

				if (!ZooClub.removeAnimal(s)) {
					System.out.println("������� ��������� ������� " + s[1] + " �������� " + s[0]
							+ " ����� �� ��� ���������� ��� ����");
				} else {
					System.out.println("������� " + s[1] + " ������ �������� � �������� " + s[0]);
				}
				break;
			} 
			case "4": { 
				System.out.print("������ ��� �������� �����: ");
				sc = new Scanner(System.in).nextLine();
				if (!ZooClub.removeClubMember(sc)) {
					System.out.println("������� ��������� �������� " + sc + " .����� �� ��� ������ �������� ����");
				} else {
					System.out.println("������� " + sc + " ������ ��������� � �����");
				}
				break;
			} 
			case "5": { 
				System.out.print("������ ��� �������: ");
				sc = new Scanner(System.in).nextLine();
				if (!ZooClub.removeAnimalFromAllMembers(sc)) {
					System.out.println("������� ��������� ������� " + sc + " ����� �� ��� ���������� ��� ����");
				} else {
					System.out.println("������� " + sc + " ������ �������� ");
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
