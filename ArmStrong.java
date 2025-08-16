package com.jspiders.practice;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		int dig = 0, r;

		while (num != 0) {
			r = num % 10;
			dig++;
			num = num / 10;
		}
		num = temp;

		int dig1;
		int r2 = 0, r1;
		while (num != 0) {
			dig1 = dig;
			r = num % 10;
			r1 = r;
			while (dig1 != 1) {

				r2 = r1 * r;
				r1 = r2;
				System.out.println(r2);
				dig1--;
			}
			System.out.println("**************************");

			sum = sum + r2;
			num = num / 10;
		}

		System.out.println(sum);

	}

}
