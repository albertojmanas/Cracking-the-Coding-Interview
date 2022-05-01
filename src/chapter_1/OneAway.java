package chapter_1;

public class OneAway {
	private static final int MAX_UNICODE = 128;

	public static void main(String[] args) {
		System.out.println(isOneAway("pale", "ple"));
		System.out.println(isOneAway("pales", "pale"));
		System.out.println(isOneAway("pale", "bale"));
		System.out.println(isOneAway("pale", "bake"));
		System.out.println(isOneAway("pale", "peke"));
		System.out.println(isOneAway("pale", "paless"));

	}

	private static boolean isOneAway(String s1, String s2) {
		if (s1.length() - s2.length() > 1 || s2.length() - s1.length() > 1) {
			return false;
		}
		int counter = 0;
		int index1 = 0;
		int index2 = 0;
		while (s1.length() > index1 && s2.length() > index2) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (counter == 2) {
					return false;
				}

				if (s1.length() > s2.length()) {
					index1++;
				} else if (s1.length() < s2.length()) {
					index2++;
				} else {
					index1++;
					index2++;
				}

				counter++;
			} else {
				index1++;
				index2++;
			}
		}
		if (index1 < s1.length() || index2 < s2.length()) {
			counter++;
		}
		return counter < 2;
	}

}
