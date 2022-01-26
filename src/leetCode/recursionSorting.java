package leetCode;

import java.io.*;
import java.util.*;

import java.util.Arrays;

public class recursionSorting {

	public static void main(String[] args) {
		solver();
	}
	
	public static int[] mergeSortRecursive(int[] arr, int lo, int hi) {
		if(lo >= hi) {
			return new int[]{arr[hi]}; 
		}
		
		int mid = (lo + hi)/2;
		int[] fp = mergeSortRecursive(arr, lo, mid);
		int[] sp = mergeSortRecursive(arr, mid + 1, hi);
		
		int[] res = mergeTwoSortedArrays(fp, sp);
		return res;
	}
  
	  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
		    System.out.println("Merging these two arrays ");
		    System.out.print("left array -> ");
		    print(a);
		    System.out.print("right array -> ");
		    print(b);
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

		  public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		  }
		  
		  public static void mergeSortInPlace(int[] arr, int lo, int hi) {
			  if(arr.length == 1)
				  return;
		
			  int mid = (lo + hi)/2;
			  mergeSortInPlace(arr, lo, mid);
			  mergeSortInPlace(arr, mid+1, hi);
			  
			  mergeTwoSortedArraysInPlace(arr, lo, hi);
		  }
		  
		  public static void mergeTwoSortedArraysInPlace(int[] arr, int lo, int hi) {
			  int[] res = new int[arr.length];
			  
			  int mid = (lo + hi)/2;
			  int i = lo, j = mid+1, k = 0;
			  
			  while(i < mid+1 && j < arr.length) {
				  if(arr[i] <= arr[j]) {
					  res[k] = arr[i];
					  i++; k++;
				  }else {
					  res[k] = arr[j];
					  j++; k++;
				  }
			  }
			  
			  while(i < mid + 1) {
				  res[k] = arr[i];
				  i++; k++;
			  }
			  
			  while(j < arr.length) {
				  res[k] = arr[j];
				  j++; k++;
			  }
			  
			  System.out.println("--------------------------------------");
			  print(res);
			  System.out.println("--------------------------------------");
		  }	  
		  
	public static void solver() {
		int[] arr = {7 , -2, 1, 4, 3};
//		int[] res = mergeSortRecursive(arr, 0, arr.length -1);
		mergeTwoSortedArraysInPlace(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(res));
	}

}
