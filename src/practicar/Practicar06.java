//Pide un número y muestra si es positivo, negativo o cero.

package practicar;

import java.util.Scanner;

public class Practicar06 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables 
		int n;
		
		//We ask to the user for a number
		System.out.print("Input a number: ");
		
		//The machine waits for an answer
		n = sc.nextInt();
		
		//The logic of the exercise
		
		if (n>0) {
			System.out.println(n + " is positive");
		}
		else if(n<0) {
			System.out.println(n + " is negative");
		}
		else {
			System.out.println("The number is 0");
		}
		
		sc.close();

	}

}
