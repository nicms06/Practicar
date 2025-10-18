/*
 * Pide tres números y muestra cuál es el mayor de ellos.
 */

package if_else;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num1, num2, num3;
		
		//Ask the user for num1, num2, num3
		System.out.println("Please input num1: ");
		num1 = sc.nextInt();
		
		System.out.println("Please input num2: ");
		num2 = sc.nextInt();
		
		System.out.println("Please input num3: ");
		num3 = sc.nextInt();
		
		//The logic of the exercise
		if (num1 == num2 && num1 == num3) {
			System.out.println("Los números son iguales");
		}
		
		else if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the biggest.");
		}
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the biggest.");
			
		}
		else{
			System.out.println(num3 + " is the biggest.");
		}
		//Close the Scanner
		sc.close();

	}

}
