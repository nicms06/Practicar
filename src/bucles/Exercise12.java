//Pirámide centrada

package bucles;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num; 
		
		System.out.println("Num: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i*2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
