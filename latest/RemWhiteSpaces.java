import java.util.Scanner;

public class RemWhiteSpaces {

	public static void main(String[] args) {

		String s = "hello    world good morning";
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) != ' ')) {

				sb.append(s.charAt(i));

			}
		}

		System.out.println(sb);
	}

}
