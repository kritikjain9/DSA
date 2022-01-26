package leetCode;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		solver();
	}
	
	public static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int pass = arr.length - 1; pass > 0; pass--) {
			int maxIdx = pass;
			for(int j = pass - 1; j >= 0; j--) {
				if(arr[j] >= arr[maxIdx])
					maxIdx = j;
			}
			System.out.println(maxIdx + "\t" + pass);
			swap(arr, maxIdx, pass);
		}
	}
	
	public static void selectionSortRecursive(int[] arr, int pass, int j, int maxIdx) {
		if(pass == 0)
			return;
		
		if(j < pass) {
			if(arr[j] >= arr[maxIdx]) {
//				maxIdx = j;
				selectionSortRecursive(arr, pass, j+1, j);
			}else {
				selectionSortRecursive(arr, pass, j+1, maxIdx);
			}
		}
		//yahaan par j saare comparisons kar chuka hai, ab swapping ki baari hai
		else {
			swap(arr, maxIdx, pass-1);
			selectionSortRecursive(arr, --pass, 0, 0);
		}
	}
	
	public static void solver(){
//		int[] arr = new int[]{4, 5, 1, 2, 3};		
		int[] arr = new int[]{7, -2, 3, 13, 9};		
		selectionSortRecursive(arr, arr.length - 1, 0, 0);
//		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
