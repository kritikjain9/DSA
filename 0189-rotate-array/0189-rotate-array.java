class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        
        reverse(nums, len - k, nums.length - 1);
        reverse(nums, 0, len - k - 1);
        reverse(nums, 0, nums.length - 1);

        
    }
    
    public void reverse(int[] arr, int start, int end){
        int i = start, j = end;
        
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++; j--;
        }
    }
}