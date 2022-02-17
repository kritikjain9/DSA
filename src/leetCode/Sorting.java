package leetCode;

import java.util.*;

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
	
//	public static void maxScoreIndices(int[] arr) {
		public static List<Integer> maxScoreIndices(int[] arr) {
		
        int n = arr.length;
        int[] zerosSum = new int[n+1];
        int[] onesSum = new int[n+1];
        
        for(int i = 0; i < arr.length; i++){
            int elem = arr[i];
            
            //prefix sum arrays
            if(elem == 0){
            	zerosSum[i+1] = zerosSum[i] + 1;
            	onesSum[i+1] = onesSum[i] + 0;
            }
            else{
            	zerosSum[i+1] = zerosSum[i] + 0;
            	onesSum[i+1] = onesSum[i] + 1;
            }
        }
        
        System.out.println(Arrays.toString(zerosSum));
        System.out.println(Arrays.toString(onesSum));
        
        //to keep track of the largest result
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MIN_VALUE);
        
        //to access the results
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int idx = 0; idx <= arr.length; idx++) {
        	int res = zerosSum[idx] + (onesSum[onesSum.length-1] - onesSum[idx]);
        	
        	hm.put(idx, res);
        	
        	if(st.peek() < hm.get(idx)) {
        		st.pop();
        		st.push(idx);
        	}else if(st.peek() == hm.get(idx)) {
        		st.push(idx);
        	}
        	
        }
        
        List<Integer> ans = new ArrayList<>();
        ans.addAll(st);
//        System.out.println(ans);
        return ans;
        
    }
		
		 public static List<Integer> _maxScoreIndices(int[] nums) {
		        List<Integer> result = new ArrayList<>();
		        int[] left = new int[nums.length+1];
		        int[] right= new int[nums.length+1];
		        int zc = 0 ,oc = 0;
		        for (int i = 0; i < nums.length ; i++) {
		            int cur = nums[i];
		            zc  +=  cur == 0 ? 1 : 0;
		            oc  +=  nums[nums.length-i-1] == 1 ? 1 : 0;
		            left[i+1]  = zc;
		            if(nums.length-i-1 >= 0){
		                right[nums.length-i-1] = oc;
		            }
		        }
		        
		        System.out.println(Arrays.toString(left));
		        System.out.println(Arrays.toString(right));

		        int max = -1 , score = 0;
		        for (int i = 0; i <= nums.length ; i++) {
		            score = left[i]  + right[i];
		            if(max == score){
		                result.add(i);
		            }
		            if(max < score){
		                max = score;
		                result.clear();
		                result.add(i);
		            }
		        }
//		        System.out.println(result);
		        return result;

		    }
	
	public static void solver(){
		maxScoreIndices(new int[] {0, 0, 1, 0});
		_maxScoreIndices(new int[] {0, 0, 1, 0});
	}
//		int[] arr = new int[]{4, 5, 1, 2, 3};		
//		int[] arr = new int[]{7, -2, 3, 13, 9};		
//		selectionSortRecursive(arr, arr.length - 1, 0, 0);
////		selectionSort(arr);
//		System.out.println(Arrays.toString(arr));
//	}

}
