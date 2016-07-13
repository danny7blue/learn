package sort;

import java.util.ArrayList;

public class QuickSort {
	public void sort() {
		ArrayList<Integer> array = SortUtil.prepareArray();
		quickSort(array, 0, array.size()-1);
		System.out.println(array);
	}

	private void quickSort(ArrayList<Integer> list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	private static int partition(ArrayList<Integer> list, int first, int last) {
		int pivot = list.get(first); //Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search
		
		while (high > low) {
			//Search forward from left
			while (low <= high && list.get(low) <= pivot) {
				low++;
			}
			
			//Search backward from right
			while (low <= high && list.get(high) > pivot) {
				high--;
			}
			
			//Swap two elements in the list
			if (high > low) {
				int temp = list.get(high);
				list.set(high, list.get(low));
				list.set(low, temp);
			}
		}
		
		while (high > first && list.get(high) >= pivot) {
			high--;
		}
		
		//Swap pivot with list.get(high)
		if (pivot > list.get(high)) {
			list.set(first, list.get(high));
			list.set(high, pivot);
			return high;
		} else {
			return first;
		}
	}
	
	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		quick.sort();
	}
}
