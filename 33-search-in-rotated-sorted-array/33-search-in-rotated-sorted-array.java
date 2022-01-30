class Solution {
//     public int search(int[] nums, int target) {
//         int st = 0, end = nums.length - 1;
    
//         while(st <= end){
//             int mid = st + (end - st)/2;
            
//             if(arr[mid] == tar){
//                 return mid;
//             }
//             else if()
            
//         }
//     }
    public int search(int[] nums, int tar){
        int res = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == tar){
                res = i;
            }
        }
        return res;
    }
}