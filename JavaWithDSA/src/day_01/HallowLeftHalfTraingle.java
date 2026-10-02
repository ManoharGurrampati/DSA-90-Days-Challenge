package day_01;

import java.util.Scanner;

// print hallow left half traingle.

//			*    
//		  * *    
//		*   *    
//    *     *    
//  * * * * * 

public class HallowLeftHalfTraingle {

	public static void main(String[] args) {
		System.out.println("Enter N Value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printStars(n);
		sc.close();
	}

	public static void printStars(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				 if (k == 1 || k == i || i == num)
		                System.out.print("*");
		            else
		                System.out.print(" ");
			}
			System.out.println();
		}
	}

}
