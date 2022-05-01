package chapter_1;

import java.util.Arrays;
import java.util.Collections;

public class IsUniqueDemo {
	private static final int MAX_UNICODE = 128;
	private static final int MAX_ASCII = 256;

	public static void main(String[] args) {
		String uniqueString = "qwertyuiopasdfghjklzxcvbnm";
		String nonUniqueString = "qqwertyuiopasdfghjklzxcvbnm";

		System.out.println(containsNoDuplicates(uniqueString));
		System.out.println(containsNoDuplicates(nonUniqueString));
	}

	private static boolean containsNoDuplicates(String str) {
		// boolean array of all false values.
		boolean[] isFoundArray = new boolean[MAX_UNICODE];
		for (int i = 0; i < str.length(); i++) {
			int charValue = str.charAt(i);
			if (isFoundArray[charValue]) { // Already found this char in string
				return false;
			}
			isFoundArray[charValue] = true;
		}
		return true;
	}

}
