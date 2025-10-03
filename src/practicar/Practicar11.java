/*
 * Número par o impar
 */

package practicar;

import java.util.Scanner;

public class Practicar11 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int n;
		String isEven;
		
		//Ask the user for a number
		System.out.print("Please input a number: ");
		n = sc.nextInt();
		
		//The logic of the exercise
		isEven = n%2==0 ? "Even" : "Odd";
		
		//We show the result 
		System.out.println(n + " is " + isEven);
		
		//Close the Scanner
		sc.close();

	}

}
