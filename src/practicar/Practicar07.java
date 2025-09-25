//Factorial de un número n.

package practicar;

import java.util.Scanner;

public class Practicar07 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables
		int n;
		long factorial = 1;
		int i;
		
		//We ask the user for a number
		System.out.print("Input a number: ");
		
		//The machine waits for a number
		n = sc.nextInt();
		
		//We close the scanner
		sc.close();
		
		//We make a loop
		for (i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		//We show the result 
		System.out.println("The factorial of " + n + " is " + factorial);
		
	}

}
