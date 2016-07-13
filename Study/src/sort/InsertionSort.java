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

	public void sort() {
		ArrayList<Integer> array = SortUtil.prepareArray();
		for (int i = 0; i < array.size(); i++) {
			/**
			 * Insert list[i] into a sorted sublist list[0..i-1] so that
			 * list[0..i] is sorted.
			 */
			int currentElement = array.get(i);
			int j;
			for (j = i - 1; j >= 0 && array.get(j) > currentElement; j--) {
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
