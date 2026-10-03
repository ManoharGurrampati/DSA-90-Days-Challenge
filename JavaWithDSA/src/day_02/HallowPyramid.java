package day_02;

import java.util.Scanner;

//	  *
//   * *
//  *   *
// *******

public class HallowPyramid {

	public static void main(String[] args) {
		System.out.println("Enter N Value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
		sc.close();
	}

	static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				if (k == 1 || k == (2 * i + 1) || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
