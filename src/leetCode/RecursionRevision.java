package leetCode;

import java.util.Arrays;

public class RecursionRevision {

	public static void main(String[] args) {
		solver();
	}
	
	public static void printRev(int n) {
		if(n == 0)return;
		System.out.println(n);
		printRev(n-1);
	}
	
	public static void backTrack(int n, int i) {
		if(n < i) {
			return;
		}
		
		backTrack(n, i+1);
		System.out.println(i);
	}
	
	
	public static int sumOfN(int n, int res) {
		if(n == 0)return res;
//		res += n;
		return sumOfN(n-1, res+n);
	}

	public static int sumOf(int n) {
		if(n == 1)return 1;
		return n + sumOf(n-1);
	}
	
	public static int fact(int n) {
		if(n == 1)return 1;
		return n * fact(n-1);
	}
	
	public static void swap(int[] arr, int s) {
		if(s >= arr.length/2)return;
		
		int temp = arr[s];
		arr[s] = arr[arr.length - s - 1];
		arr[arr.length - s - 1] = temp;
		swap(arr, s+1);
	}
	
	public static boolean isPalin(String str, int s) {
		if(s >= str.length()/2) {
			return true;
		}
		
		if(str.charAt(s) != str.charAt(str.length() - s - 1)) {
			return false;
		}
			return isPalin(str, s+1);
	}
	
	public static void printSubsequences(String str, String res) {
		if(str.isEmpty()) {
			System.out.println(res);
			return;
		}
		
		char ch = str.charAt(0);
		printSubsequences(str.substring(1), res + ch);
		printSubsequences(str.substring(1), res);
	}
	
	public static void solver() {
		printSubsequences("abc", "");
//		System.out.println(isPalin("abaaa", 0));
//		int[] arr = new int[] {1,2,3,4,5};
//		swap(arr, 0);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(fact(4));
//		System.out.println(sumOfN(5, 0)); 
//		System.out.println(res);
//		System.out.println(sumOf(3)); 
		
//		printRev(5);
//		backTrack(5, 1);
	}
	
}
