/*
 * Pide un año y determina si es bisiesto:
 * (Es bisiesto si es divisible por 4, pero no por 100, excepto si también es divisible por 400).
 */

package if_else;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int year;
		
		//We ask the user for a year
		System.out.println("Please, input a year");
		year = sc.nextInt();
		
		//the logic of the exercise
		if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " isn't a leap year.");
		}
		
		//Close the Scanner
		sc.close();

	}

}
