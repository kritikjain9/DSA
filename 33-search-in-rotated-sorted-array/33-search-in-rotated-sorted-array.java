class Solution {
    public int search(int[] arr, int target) {
        if(arr.length == 1){
            if(arr[0] == target)
                return 0;
            else
                return -1;
        }
        
        int pivot = findPivot(arr);
        
        int leftSearch = binarySearch(arr, target, 0, pivot);
        if(leftSearch != -1)
            return leftSearch;
        
        int rightSearch = binarySearch(arr, target, pivot + 1, arr.length - 1);
        if(rightSearch != -1)
            return rightSearch;
        
        return -1;
    }
    
    public int binarySearch(int[] arr, int tar, int st, int end){
    
        int res = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            
            if(arr[mid] == tar)
                return mid;
            else if(arr[mid] < tar)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return res;
    }
    
    public int findPivot(int[] arr){
        if(arr[0] < arr[arr.length - 1])
            return arr.length - 1;
        
        int res = -1;
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(mid < end && arr[mid] > arr[mid + 1])
                res = mid;
            else if(mid > st && arr[mid] < arr[mid - 1])
                res = mid - 1;
                
            //checking where to search
            if(arr[st] >= arr[mid])
                end = mid - 1;
            else
                st = mid + 1;
        }
        return res;
    }
    
}