class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        if(arr[0] < arr[n - 1])
            return arr[0];
        
        if(arr.length == 1){
            return arr[0];
        }
        
        int st = 0, end = n - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[mid] > arr[(mid+1) % n]){
                return arr[mid + 1];
            }
            if(arr[mid] < arr[(mid - 1 + n) % n]){
                return arr[mid];
            }
            
            if(arr[0] > arr[mid]){
                end = mid - 1;
            }else if(arr[mid] > arr[0]){
                st = mid + 1;
            }
            
        }
        return -1;
    }
}