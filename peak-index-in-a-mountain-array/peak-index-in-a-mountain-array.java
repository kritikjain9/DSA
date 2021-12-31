class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st = 0, end = arr.length - 1;
        
        while(st < end){
            int mid = st + (end - st) / 2;
            //middle check
            if(arr[mid] < arr[mid + 1]){
                st = mid + 1;
            }
            
            else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            
        }
        return end;
    }
}