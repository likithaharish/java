import java.util.Scanner;

public class ReverseGetPolidrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num, num1, r, sum = 0, flag = 0;
		System.out.println("enter the number");
		num = s.nextInt();
		int temp = num;

		while (num != 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;

		}

		if (temp == sum) {
			flag = 1;
			System.out.println(temp + "=" + "u entered a palidrome number");
		} else {

			do {
				System.out.println("enter the number to add");
				num1 = s.nextInt();
				sum = sum + num1;
				System.out.println("the toal number is=" + sum);
				if (sum > temp) {
					System.out
							.println("number exceeds the polidrome number..so plx try again later");
					flag = 1;
					break;
				}

			} while (sum != temp);
		}

		if (flag == 0) {
			System.out.println(temp + "=" + "u got a polidrome number");
		}

	}

}
