package chapter_2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class Partition {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(1);
		System.out.println("Original List:\t" + list);
		int pivot = 5;
		List<Integer> newList = partitionList(list, pivot);
		System.out.println("New List:\t" + newList);

	}

	private static List<Integer> partitionList(List<Integer> list, int pivot) {
		ListIterator<Integer> iter = list.listIterator();
		List<Integer> leftList = new LinkedList<>();
		List<Integer> rightList = new LinkedList<>();
		
		while (iter.hasNext()) {
			int next = iter.next();
			if(next < pivot) {
				leftList.add(next);
			} else {
				rightList.add(next);
			}
		}
		System.out.println("Left List: " + leftList + "\tPivot: " + pivot + "\tRight List: " + rightList);
		leftList.addAll(rightList);
		return leftList;
			
	}
	

}
