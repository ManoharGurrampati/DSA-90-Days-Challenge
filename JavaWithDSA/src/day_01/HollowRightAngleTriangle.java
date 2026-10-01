package day_01;

import java.util.Scanner;

//Print Hallow Left Half Triangle
/*
 		*           
 		* *         
 		*   *       
 		*     *     
 		* * * * *  
 */

public class HollowRightAngleTriangle {

	public static void main(String[] args) {
		System.out.println("Enter N Value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printStars(n);
		sc.close();
	}

	public static void printStars(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j || i == num - 1 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
