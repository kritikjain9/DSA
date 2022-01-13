class Solution {
    public int findKthLargest(int[] arr, int k) {
        if(arr.length == 1){
            return arr[0];
        }
        
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}