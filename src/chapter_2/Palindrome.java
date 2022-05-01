package chapter_2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {

	public static void main(String[] args) {
		List<Character> list = new LinkedList<>();
		list.add('t');
		list.add('a');
		list.add('c');
		list.add('o');
		list.add('c');
		list.add('a');
		list.add('t');
		System.out.println(list);

		System.out.println(isPalindrome(list));

	}

	private static <E> boolean isPalindrome(List<E> list) {
		ListIterator<E> iterAscending = list.listIterator();
		ListIterator<E> iterDescending = list.listIterator(list.size());
		while (iterAscending.hasNext() && iterDescending.hasPrevious() && iterAscending.nextIndex() != iterDescending.nextIndex()) {
			if(iterAscending.next() == iterDescending.previous()) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}
