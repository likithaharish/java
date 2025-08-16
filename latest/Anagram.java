public class Anagram {

	public static void main(String[] args) {

		String s1 = "mot her i";
		String s2 = "i mother";
		int count = 0, s1count = 0, s2count = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != ' ') {
				s1count++;

				for (int j = 0; j < s2.length(); j++) {

					if (s2.charAt(j) != ' ') {

						if (s1.charAt(i) == s2.charAt(j)) {
							count++;
							break;
						}
					}
				}
			}
		}
		if (count == s1count) {
			System.out.println(" It is Anagram");

		} else {

			System.out.println(" it is not anagram");
		}
	}

}
