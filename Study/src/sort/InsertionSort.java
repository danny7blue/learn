/**
 * 
 */
package sort;

import java.util.ArrayList;

/**
 * @author Danny
 *
 */
public class InsertionSort {
	private ArrayList<Integer> array = new ArrayList<Integer>();
	
	public InsertionSort() {
		array.add(4);
		array.add(3);
		array.add(1231);
		array.add(34);
		array.add(74);
		array.add(23);
		array.add(290);
		array.add(35);
		array.add(77);
	}
	public void sort() {
		for (int i = 0; i < array.size(); i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that
			 list[0..i] is sorted. */
			int currentElement = array.get(i);
			int j;
			for (j = i - 1; j >=0 && array.get(j) > currentElement; j--) {
				array.set(j + 1, array.get(j));
			}
			array.set(j + 1, currentElement);
		}
		System.out.println(array);
	}
	
	public static void main(String[] args) {
		InsertionSort insert = new InsertionSort();
		insert.sort();
	}
}
