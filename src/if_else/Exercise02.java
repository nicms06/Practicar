/*
 * Según la edad del usuario:
 * < 12 → “Niño”
 * 12–17 → “Adolescente”
 * 18–64 → “Adulto”
 * ≥ 65 → “Adulto mayor”
 */

package if_else;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable number
		int num;
		
		//Ask the user for his age
		System.out.println("Please, input your age: ");
		num = sc.nextInt();
		
		//The logic
		if (num < 0) {
			System.out.println("Your age must be positive.");
		}
		else if(num <12) {
			System.out.println("You are a child.");
		}
		else if(num >=12 && num <18) {
			System.out.println("You are a teenager.");
		}
		else if(num >=18 && num <65) {
			System.out.println("You are an adult.");
		}
		else {
			System.out.println("You are an older adult.");
		}
		
		//Close the Scanner
		sc.close();

	}

}
