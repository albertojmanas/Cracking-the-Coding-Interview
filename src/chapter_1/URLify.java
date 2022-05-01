package chapter_1;

public class URLify {

	public static void main(String[] args) {
		String test = "Mr John Smith";
		System.out.print(test);
	}
	
	private static String URLify(String s) {
		char[] c = s.replace(" ", "%20").toCharArray();
		return new String(c);
	}

}
