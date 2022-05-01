package chapter_1;

public class StringCompression {

	public static void main(String[] args) {
		
		System.out.println(compressString("aabbccc"));
		System.out.println(compressString("aabbbbbbbbbbbhhhfg"));
		System.out.println(compressString("a"));
		System.out.println(compressString("abbaa"));
	}
	
	private static String compressString(String s) {
		char[] charArr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int charPlacingIndex = 0;
		int iteratingIndex = 0;
		while(iteratingIndex < charArr.length) {
			int comparingIndex = iteratingIndex;
			while (comparingIndex < charArr.length && charArr[comparingIndex] == charArr[iteratingIndex]) {
				comparingIndex++;
			}
			
			sb.append(charArr[iteratingIndex]);
			if (comparingIndex - iteratingIndex > 1) {
				sb.append(String.valueOf(comparingIndex - iteratingIndex));
			}
			iteratingIndex = comparingIndex;
		}
		return sb.toString();
	}


}
