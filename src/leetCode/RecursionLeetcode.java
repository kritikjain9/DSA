package leetCode;

import java.util.Arrays;

public class RecursionLeetcode {

	public static void main(String[] args) {
		solver();
	}
	
	public static void pattern1(int n, int r, int c) {
		if(r > n)
			return;
		
		if(c < r) {
			System.out.print("*\t");
			pattern1(n, r, c += 1);
		}
		else {
			System.out.println();
			pattern1(n, r += 1, 0);
		}
		
	}
    
	public static void wrongMethodBubbleSort(int[] arr, int s, int e) {
		if(s == e)
			return;
		
		for(int i = s; i < e; i++) {
			if(arr[i+1] < arr[i]) {
				swap(arr, i+1, i);
			}
		}
		wrongMethodBubbleSort(arr, s, e - 1);
	}
	
	public static void bubbleSortRecursive(int[] arr, int pass, int idx) {
		if(pass == 0)
			return;
		
		if(idx < pass) {			
			if(arr[idx] > arr[idx+1]) {
				swap(arr, idx, idx+1);
			}
			bubbleSortRecursive(arr, pass, ++idx);
		}
		else {
			bubbleSortRecursive(arr, --pass, 0);
		}
		
	} 
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
//	public static void selectionSortRecursive(int[] arr, int minIdx) {
//		if(idx == arr.length - 1)
//			return;
//	
//		int minIdx = findMinIdx(arr, idx, minIdx);
//		swap(arr, idx, minIdx);
//		
//		//calling
//		selectionSortRecursive(arr, ++idx, minIdx);
//	}
	
	public static int findMinIdx(int[] arr, int minIdx) {
		if(minIdx == arr.length - 1) {
			return arr[minIdx];
		}
		
		if(arr[minIdx] > arr[minIdx+1])
			minIdx = minIdx + 1;
		
		return findMinIdx(arr, ++minIdx);
	}

	public static int[] mergeSortRecursive(int[] arr, int lo, int hi) {
		if(lo >= hi) {
			return new int[]{arr[hi]}; 
		}
		
		int mid = (lo + hi)/2;
		int[] fp = mergeSortRecursive(arr, 0, mid);
		int[] sp = mergeSortRecursive(arr, mid + 1, hi);
		
		int[] res = mergeTwoSortedArrays(fp, sp);
		return res;
	}
	
	  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
		    int i = 0, j =0, k = 0;
		    int[] ans = new int[a.length + b.length];
		    while(i < a.length && j < b.length){
		        if(a[i] <= b[j]){
		          ans[k] = a[i];
		          i++;
		          k++;
		        }else{
		          ans[k] = b[j];
		          j++;
		          k++;
		        }
		    }

		    while(i < a.length){
		      ans[k] = a[i];
		      k++;
		      i++;
		    }

		    while(j < b.length){
		      ans[k] = b[j];
		      k++;
		      j++;
		    }
		    
		    return ans;
		  }
	
//	public static int[] mergeTwoSortedArrays(int[] a , int [] b) {
//		int n = a.length, m = b.length;
//		int[] res = new int[n + m];
//		
//		int i = 0, j = 0, k = 0;
//		while(i < n && j < m) {
//			if(a[i] <= b[j]) {
//				res[k] = a[i];
//				i++; k++;
//			}
//			else {
//				res[k] = b[j];
//				j++; k++;
//			}
//		}
//		
//		for(int rem = i; rem < n; rem++) {
//			res[k] = a[i];
//			k++;
//		}
//		
//		for(int rem = j; rem < m; rem++) {
//			res[k] = b[j];
//			k++;
//		}
////		System.out.println(Arrays.toString(res));
//		return res;
//	}
	
	public static void solver() {
		int[] arr = {7, -2, 4, 1, 3};
		int[] res = mergeSortRecursive(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(res));
//		selectionSortRecursive(arr, 0);
//		bubble(arr, arr.length - 1, 0);
//		bubbleSortRecursive(arr, 0, arr.length - 1);
//		pattern1(5, 1, 0);
	}

}
