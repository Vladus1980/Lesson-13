package Lesson_13;

import java.util.Scanner;

public class apl {

	static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");

	}

	public static void main(String[] args) {

		Parlament parlament = new Parlament();
		Fraction fraction = new Fraction(null);

		menu();
		Scanner sc = new Scanner(System.in);
		while (true) {
			switch (sc.next()) {
			case "1": {
				parlament.addFraction();
			}

				break;
			case "2": {
				parlament.removeFraction();
			}

				break;
			case "3": {
				parlament.viewAllFraction();
			}

				break;
			case "4": {
				parlament.clearFraction();
			}

				break;
			case "6": {
				parlament.viewAllFraction();
				System.out.println("������ �� ��� ������ ������ ��������");
				
				parlament.addDeputatInFraction();
				
			}

				break;
			case "5" :{
				parlament.viewFraction();
			}
			
				
				break;
			case "7" :{
				parlament.removeDeputat();
			}
				
				break;
			case "8" :{
				parlament.viewAllBriber();
			}
				
				break;
			case "9" :{
				fraction.viewBigestBrider();
			}
				
				break;

			default:
				System.out.println("������ ���� �� 1 �� 9");
				break;
			}
		}

	}

}

