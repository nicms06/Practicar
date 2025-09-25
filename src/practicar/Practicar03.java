//Pide tres números y muestra el mayor.

package practicar;

import java.util.Scanner;

public class Practicar03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables n1, n2, n3
		int n1;
		int n2;
		int n3;
		
		//We ask the numbers to the user
		System.out.println("Input the first number: ");
		
		//The machine waits for the number
		n1 = sc.nextInt();
		
		//We ask the numbers to the user
		System.out.println("Input the second number: ");
				
		//The machine waits for the number
		n2 = sc.nextInt();
		
		//We ask the numbers to the user
		System.out.println("Input the first number: ");
				
		//The machine waits for the number
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("The biggest number is: " + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("The biggest number is: " + n2);
		}
		else {
			System.out.println("The biggest number is: " + n3);
		}
		
		sc.close();		
		
	}

}
