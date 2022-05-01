package chapter_1;

public class IsPermutationPalindrome {
	private static final int MAX_UNICODE = 128;

	public static void main(String[] args) {

		System.out.println(isPermutationPalindrome("taco cat taco cat"));
		System.out.println(isPermutationPalindrome("cat taco taco cat"));

	}

	private static boolean isPermutationPalindrome(String s) {
		int[] characterCodeCounts = new int[MAX_UNICODE];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				characterCodeCounts[s.charAt(i)]++;
			}
		}

		int count = 0;
		for (int i = 0; i < MAX_UNICODE; i++) {
			count += characterCodeCounts[i] % 2;
		}

		return count <= 1;
	}

}
