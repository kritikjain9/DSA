package binarySearch;

public class LeetCodeBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solver();
	}
	
	
	
	public static int[] searchRange(int[] arr, int tar) {
        if(arr.length == 0){
            return new int[] {-1, -1};
        }
        
         int[] res = new int[2];
         int i = 0;
//        ArrayList<Integer> res = new ArrayList<>();
        int st = 0, end = arr.length - 1;
        
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(tar > arr[mid]){
                st = mid + 1;
            }else if(tar < arr[mid]){
                end = mid - 1;
            }else if(tar == arr[mid]){
                res[i] = mid;
                st = mid + 1;
                i++;
            }
        }
         return res;
    }
	
	public static int binSearchInfinite(int[] arr, int tar) {
		int low = 0, high = 1;
		while(tar >= arr[high]) {
			if(tar > arr[high]) {
				low = high;
				high = 2 * high;
			}
		}
//		System.out.println(low + " " + high);
		
			int st = low, end = high;
			while(st <= end){
	            int mid = st + (end - st) / 2;
	            if(tar > arr[mid]){
	                st = mid + 1;
	            }else if(tar < arr[mid]){
	                end = mid - 1;
	            }else if(tar == arr[mid]){
	                return mid;
	            }
	        }
			return -1;
	}
	
		public int peakIndexInMountainArray(int[] arr) {
			
	        return 0;
	    }
		
		public static int ans(int[] arr, int tar) {
	        // first find the range
	        // first start with a box of size 2
	        int start = 0;
	        int end = 1;

	        // condition for the target to lie in the range
	        while (tar > arr[end]) {
	            int temp = end + 1; // this is my new start
	            // double the box value
	            // end = previous end + sizeofbox*2
	            end = end + (end - start + 1) * 2;
	            start = temp;
	        }

	        int st = start, ending = end;
			while(st <= ending){
	            int mid = st + (ending - st) / 2;
	            if(tar > arr[mid]){
	                st = mid + 1;
	            }else if(tar < arr[mid]){
	            	ending = mid - 1;
	            }else if(tar == arr[mid]){	
	                return mid;
	            }
	        }
	        return - 1;
	    }
	
	public static void solver() {
		int[] nums = {5, 7, 8, 10, 12, 14, 16, 19, 20, 21, 22};
//		System.out.println(binSearchInfinite(nums, 22));
		System.out.println(ans(nums, 22));
//		int[] res = searchRange(nums, 8);
//		System.out.println(Arrays.toString(res));
		
	}
	
}
