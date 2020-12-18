package Lesson_13;

import java.util.Scanner;

public class Deputat extends Human {

	String lastName;
	String firstName;
	boolean bribe;
	int sumBribe;
	

	public Deputat(int weigh, int height, String lastName, String firstName, boolean bribe) {
		super(weigh, height);
		this.lastName = lastName;
		this.firstName = firstName;
		this.bribe = bribe;
	}

	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isBribe() {
		return bribe;
	}

	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}

	public int getSumBribe() {
		return sumBribe;
	}

	public void setSumBribe(int sumBribe) {
		this.sumBribe = sumBribe;
	}

	

	@Override
	public String toString() {
		return "Deputat [lastName=" + lastName + ", firstName=" + firstName + ", bribe=" + bribe +"]";
	}

	public void giveBribe() {
		if (bribe == false) {
						
			System.out.println("Цей депутат не бере хабарів!");
			

		} else {
			System.out.println("Введіть суму хабаря");
			Scanner sc = new Scanner(System.in);
			 int sumBribeGive = sc.nextInt();
			
			{
				if (sumBribeGive > 5000) {
					System.out.println("Поліція ув'язнить депутата!");
				}else {
					sumBribe = sumBribeGive;
					System.out.println(sumBribe);
					
				}
			}

		}

	}
	
	

}
