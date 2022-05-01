package chapter_2;

import java.util.LinkedList;
import java.util.List;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		List<Character> list = new LinkedList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('n');
		list.add('m');

		removeMiddleNode('c', list);
		System.out.println(list.toString());
	}

	private static <E> void removeMiddleNode(E e, List list) {
		if (list.indexOf(e) != 0 && list.indexOf(e) != list.size() - 1) {
			list.remove(e);
		} else {
			System.out.println("Couldn't delete.");
		}
	}

}
