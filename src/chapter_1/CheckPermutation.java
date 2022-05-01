package chapter_1;

import java.util.Arrays;

public class CheckPermutation {
	private static final int MAX_UNICODE = 128;

	// Case and white space sensitive.
	public static void main(String[] args) {
		
		// Works
		System.out.println("-------WORKING--------");
		System.out.println(isPermuation("hello", "olhel"));
		System.out.println(isPermuation("How are you", "are you How"));
		System.out.println("-----NOT WORKING-------");
		// Doesn't Work
		System.out.println(isPermuation("Hello", "hello"));
		System.out.println(isPermuation("hello ", "olhel"));
		System.out.println(isPermuation("How are you", "are you how"));

	}

	private static boolean isPermuation(String s1, String s2) {
		if (s1.length() != s2.length() && s1 != null && s2 != null) {
			return false;
		}	
		int[] characterCodeCounts = new int[MAX_UNICODE];
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				characterCodeCounts[s1.charAt(i)]++;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
				characterCodeCounts[s2.charAt(i)]++;
		}

		int count = 0;
		for (int i = 0; i < MAX_UNICODE; i++) {
			count += characterCodeCounts[i] % 2;
		}
		
		return count < 1;
	}

}
