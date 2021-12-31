class Solution {
    public int searchInsert(int[] arr, int tar) {
        if(tar < arr[0])
            return 0;
        
        if(tar > arr[arr.length - 1])
            return arr.length;
        
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = (st + end) / 2;
            if(tar > arr[mid]){
                st = mid + 1;
            }
            else if(tar < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return st;
    }
}