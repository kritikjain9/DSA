class Solution {
    public int[] shuffle(int[] nums, int n) {
        int st = 0, end = n;
        int[] res = new int[nums.length];
        
        boolean flag = true;
        int idx = 0;
        while(st < n && end < nums.length){
            if(flag){
                res[idx++] = nums[st++];
            }else{
                res[idx++] = nums[end++];
            }
            flag = !flag;
            // System.out.println("Element Printed ->" + res[idx-1]);
        }
        res[idx] = nums[end];
        return res;
    }
}