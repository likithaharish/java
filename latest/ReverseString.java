import java.util.Scanner;

public class ReverseString {
	static String sg = new String();
	static StringBuffer s = new StringBuffer("%$#@!*&^%)(");

	public static void main(String[] args) {

		char temp;
		int len = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++, len--) {

			temp = s.charAt(i);
			s.setCharAt(i, s.charAt(len));
			s.setCharAt(len, temp);

		}
		System.out.println(s);

	}
}
