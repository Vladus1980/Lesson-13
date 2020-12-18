package Lesson_13;

import java.util.Scanner;

public class apl {

	static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");

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
				System.out.println("Вкажіть до якої бажаєте додати депутата");
				
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
				System.out.println("Введіть чило від 1 до 9");
				break;
			}
		}

	}

}

