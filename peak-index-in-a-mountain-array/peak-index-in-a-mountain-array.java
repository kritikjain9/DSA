class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx = 0;
        for(; idx < arr.length - 1; idx++){
            if(arr[idx] > arr[idx+1]){
                return idx;
            }
        }
        return -1;
    }
}