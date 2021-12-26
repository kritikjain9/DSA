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
		
		public static boolean binarySearch(int[] arr, int tar) {
			int st = 0, ending = arr.length - 1;
			while(st <= ending){
	            int mid = st + (ending - st) / 2;
	            if(tar > arr[mid]){
	                st = mid + 1;
	            }else if(tar < arr[mid]){
	            	ending = mid - 1;
	            }else if(tar == arr[mid]){	
	                return true;
	            }
	        }
	        return false;
		}
		
		public static int findInMountainArray(int[] arr, int tar) {
			boolean res = binarySearch(arr, tar);
			if(!res)return -1;
			
			int st = 0, ending = arr.length - 1;
			while(st <= ending){
	            int mid = st + (ending - st) / 2;
	            if(tar > arr[mid]){
	                st = mid + 1;
	            }else if(tar < arr[mid]){
	            	ending = mid - 1;
	            }else if(tar == arr[mid]){	
	                ending = mid - 1;
	            }
	        }
	        return st;
		}
		
		public static int pivotInDuplicateRotated(int[] arr) {
			int left = 0, right = arr.length - 1;
			while(left <= right) {
				if(arr[left] == arr[right]) {
					left += 1; right += 1;
				}
				
				int mid = left + (right - left)/2;
				if(mid < right && arr[mid] > arr[mid+1]) {
					return mid;
				}
				else if(mid > left && arr[mid] < arr[mid - 1]) {
					return mid - 1;
				}
				
				else if(arr[left] > arr[mid]) {
					//left part will have the pivot
					right = mid - 1;
				}
				
				else {
					left = mid + 1;
				}
				
			}
			return -1;
		}
	
	public static void solver() {
		int[] arr = {4,4,5,5,6,9,1,2,2,3,4};
		System.out.println(pivotInDuplicateRotated(arr));
//		int[] nums = {0,1,2,4,2,1};
//		System.out.println(binSearchInfinite(nums, 22));
//		System.out.println(findInMountainArray(nums, 3));
//		int[] res = searchRange(nums, 8);
//		System.out.println(Arrays.toString(res));
		
	}
	
}
