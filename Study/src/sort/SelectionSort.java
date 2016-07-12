/**
 * 
 */
package sort;

import java.util.ArrayList;

/**
 * @author Danny
 *
 */
public class SelectionSort {

	public void sort() {
		ArrayList<Integer> array = SortUtil.prepareArray();
		for (int i = 0; i < array.size() - 1; i++) {
			int currentMaxIndex = i;
			int currentMax = array.get(i);
			for (int j = i + 1; j < array.size(); j++) {
				if (currentMax < array.get(j)) {
					currentMax = array.get(j);
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				array.set(currentMaxIndex, array.get(i));
				array.set(i, currentMax);
			}
		}
		System.out.println(array);
	}

	public static void main(String[] args) {
		SelectionSort select = new SelectionSort();
		select.sort();
	}
}
