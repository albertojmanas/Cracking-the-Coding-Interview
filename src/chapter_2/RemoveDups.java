package chapter_2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RemoveDups {
	private static final int MAX_UNICODE = 128;

	public static void main(String[] args) {
		List<Character> list = new LinkedList<>();
		list.add('a');
		list.add('b');
		list.add('b');
		list.add('c');
		list.add('a');
		list.add('e');
		System.out.println(list.toString());
		removeDups(list);
		System.out.println(list.toString());
	}

	// no temporary buffers used.
	private static List<Character> removeDups(List list) {
		boolean[] isHere = new boolean[MAX_UNICODE];
		ListIterator<Character> iter = list.listIterator();
		while (iter.hasNext()) {
			int charValue = Character.getNumericValue((char) iter.next());
			if (isHere[charValue] == true) {
				iter.remove();
			}
			isHere[charValue] = true;
		}
		return list;
	}

}
