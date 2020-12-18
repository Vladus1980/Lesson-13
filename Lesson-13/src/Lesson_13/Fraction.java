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
		System.out.println("������ ������� ��������");
		String lastName = sc.next();
		System.out.println("������ ��'� ��������");
		String firstName = sc.next();
		System.out.println("������ ���� ��������");
		int weigh = sc.nextInt();
		System.out.println("������ ���� ��������");
		int height = sc.nextInt();
		System.out.println("������ �� ���� ������� �����: True ��� False ");
		boolean bribe = sc.nextBoolean();

		Deputat dep = new Deputat(weigh, height, lastName, firstName, bribe);
		dep.giveBribe();

		deputatInFraction.add(dep);

		System.out.println(dep.toString() + " ������� ������ �������� ����");
		
	}
	

	void clearFraction() {
		deputatInFraction.clear();
		System.out.println("�� �������� ������� �� �������");

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
		
		System.out.println("������ ������� �������� ����� ����� ��������");
		String lastName = sc.next();

		boolean isExist = depExist(lastName);

		if (isExist) {

			Iterator<Deputat> iterator = deputatInFraction.iterator();
			while (iterator.hasNext()) {
				Deputat nextDep = iterator.next();
				if (nextDep.getLastName().equalsIgnoreCase(lastName)) {
					iterator.remove();
					System.out.println(nextDep + " ������� ������");
				}
			}

		} else {
			System.out.println("������ �������� � ������� ����");

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
		System.out.println("���������:");
		for (Deputat dep : deputatInFraction) {
			if (dep.isBribe()) {
				System.out.println(dep.toString());
			}
		}

	}

	void viewAllDeputat() {
		System.out.println("������ ��������: ");
		for (Deputat dep : deputatInFraction) {
			System.out.println(dep.toString());
		}

	}

	void viewBigestBrider() {
		System.out.println("��������� ��������: "  );
		

	}

	

}
