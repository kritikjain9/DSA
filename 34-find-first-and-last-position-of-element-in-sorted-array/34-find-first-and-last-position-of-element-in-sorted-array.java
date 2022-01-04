class Solution {
    public int[] searchRange(int[] arr, int tar) {
        if(arr.length == 0){
            return new int[] {-1, -1};
        }
        
        int[] res = new int[2];
        int st = 0, end = arr.length - 1;
        
        res[0] = firstIndex(arr, tar);
        res[1] = lastIndex(arr, tar);
        
        return res;
    }
    
    public int firstIndex(int[] arr, int tar){
        int res = -1;
        
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[mid] == tar){
                res = mid;
                end = mid - 1;
            }
            else if(arr[mid] > tar){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return res;
    }
    
    public int lastIndex(int[] arr, int tar){
        int res = -1;
        
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[mid] == tar){
                res = mid;
                st = mid + 1;
            }
            else if(arr[mid] < tar){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return res;
    }
    
}