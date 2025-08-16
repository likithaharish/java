import java.util.Scanner;

public class PairOfElement {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int num;
		Scanner s = new Scanner(System.in);

		System.out.println("the elements which present in the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");
		System.out.println("enter some number");
		num = s.nextInt();
		int len = arr.length;

		System.out.println("the pair elements which are total to given number");
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {

				if (arr[i] + arr[j] == num) {

					System.out.println(arr[i] + "," + arr[j]);
					arr[j] = ' ';
					break;
				}
			}
		}

	}

}
