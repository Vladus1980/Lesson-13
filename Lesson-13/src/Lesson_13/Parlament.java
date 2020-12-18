package Lesson_13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class Parlament  {
	
	static Parlament parlament = new Parlament(); {
		
		
	}
	
	Fraction fraction = new Fraction(null);
	ArrayList <Fraction> parlamentFraction = new ArrayList<Fraction>();
	
	
	
	Scanner sc = new Scanner(System.in);
	
	void addFraction() {
		System.out.println("Введіть назву фрації, щоб її додати");
		String nameFraction = sc.next();
		System.out.println("Додано фракцію - " + nameFraction);
		
		Fraction frac = new Fraction(nameFraction); 
			parlamentFraction.add(frac);
		
	}
	
	void removeFraction() {
		System.out.println("Введіть назву фрації, щоб її видалити");
		String nameFraction = sc.next();
		
		boolean isExist = fracExist(nameFraction);
		if (isExist) {
			Iterator<Fraction> iterator = parlamentFraction.iterator();
			while (iterator.hasNext()) {
				Fraction nextFrac = iterator.next();
				if (nextFrac.getNameFraction().equalsIgnoreCase(nameFraction)) {
					iterator.remove();
					System.out.println(nextFrac + " видалена");
				}
				
			}
		}else {
			System.out.println("Немає такої фракції");
		}
		
		
	}
	boolean fracExist(String nameFraction) {
		boolean flag = false;
		
		for (Fraction frac : parlamentFraction) {
			if (frac.getNameFraction().equalsIgnoreCase(nameFraction)) {
				flag = true;
			}
		}
		return flag;
	}
	
	
	
	void viewAllFraction() {
		System.out.println("В парламенті є наступні фракції: ");
		for (Fraction frac : parlamentFraction) {
			System.out.println(frac.toString());
		}
		
	}
	
	void viewFraction() {
		System.out.println("Введіть назву фрації, щоб її видалити");
		String nameFraction = sc.next();
		
		boolean isExist = fracExist(nameFraction);
		if (isExist) {
			Iterator<Fraction> iterator = parlamentFraction.iterator();
			while (iterator.hasNext()) {
				Fraction nextFrac = iterator.next();
				if (nextFrac.getNameFraction().equalsIgnoreCase(nameFraction)) {
					System.out.println(nextFrac);
				}
				
			}
		}else {
			System.out.println("Немає такої фракції");
		}
		
		
	}
	
	void addDeputatInFraction() {
		System.out.println("Введіть назву фрації, щдо якої додати депутата");
		String nameFraction = sc.next();
		
		boolean isExist = fracExist(nameFraction);
		if (isExist) {
			Iterator<Fraction> iterator = parlamentFraction.iterator();
			while (iterator.hasNext()) {
				Fraction nextFrac = iterator.next();
				if (nextFrac.getNameFraction().equalsIgnoreCase(nameFraction)) {
					fraction.addDeputat();
				}
				
			}
		}else {
			System.out.println("Немає такої фракції");
		}
		
	}
	
	void removeDeputat() {
		fraction.removeDeputat();
	}
	
	void viewAllBriber() {
		fraction.viewAllBriber();
		
	}
	
	void viewBigestBriber() {
		
	}
	
	void clearFraction() {
		fraction.clearFraction();
		
		}
}
	
	


