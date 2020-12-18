package Lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	List<Deputat> deputatInFraction = new ArrayList<Deputat>();

	String nameFraction;

	Scanner sc = new Scanner(System.in);

	public Fraction(String nameFraction) {
		super();
		this.nameFraction = nameFraction;
	}

	

	public void addDeputat() {
		System.out.println("Введіть прізвище депутата");
		String lastName = sc.next();
		System.out.println("Введіть ім'я депутата");
		String firstName = sc.next();
		System.out.println("Введіть вагу депутата");
		int weigh = sc.nextInt();
		System.out.println("Введіть зріст депутата");
		int height = sc.nextInt();
		System.out.println("Введіть чи бере депутат хабарі: True або False ");
		boolean bribe = sc.nextBoolean();

		Deputat dep = new Deputat(weigh, height, lastName, firstName, bribe);
		dep.giveBribe();

		deputatInFraction.add(dep);

		System.out.println(dep.toString() + " отримав мандат Верховної Ради");
		
	}
	

	void clearFraction() {
		deputatInFraction.clear();
		System.out.println("Всі депутати видалені із фракції");

	}

	boolean depExist(String lastName) {
		boolean flag = false;
		
		for (Deputat dep : deputatInFraction) {
			if (dep.getLastName().equalsIgnoreCase(lastName)){
				flag = true;
			}
		}
		
		return flag;
	}

	public String getNameFraction() {
		return nameFraction;
	}

	void removeDeputat() {
		
		System.out.println("Введіть прізвище депутата якого треба видалити");
		String lastName = sc.next();

		boolean isExist = depExist(lastName);

		if (isExist) {

			Iterator<Deputat> iterator = deputatInFraction.iterator();
			while (iterator.hasNext()) {
				Deputat nextDep = iterator.next();
				if (nextDep.getLastName().equalsIgnoreCase(lastName)) {
					iterator.remove();
					System.out.println(nextDep + " втратив мандат");
				}
			}

		} else {
			System.out.println("Такого депутата в переліку немає");

		}

	}

	public void setNameFraction(String nameFraction) {
		this.nameFraction = nameFraction;
	}

	@Override
	public String toString() {
		return "Fraction [nameFraction=" + nameFraction + "]";
	}

	void viewAllBriber() {
		System.out.println("ХАБАРНИКИ:");
		for (Deputat dep : deputatInFraction) {
			if (dep.isBribe()) {
				System.out.println(dep.toString());
			}
		}

	}

	void viewAllDeputat() {
		System.out.println("Перелік депутатів: ");
		for (Deputat dep : deputatInFraction) {
			System.out.println(dep.toString());
		}

	}

	void viewBigestBrider() {
		System.out.println("Найбільший ХАБАРНИК: "  );
		

	}

	

}
