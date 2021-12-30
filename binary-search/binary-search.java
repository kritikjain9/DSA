class Solution {
    public int search(int[] arr, int tar) {
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            
            if(arr[mid] == tar)
                return mid;
            else if(arr[mid] > tar)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }
}