class Solution {
    public int[] runningSum(int[] arr) {
        int n = arr.length, sum = 0;
        int[] res = new int[n];
        
        for(int num : arr)
            sum += num;
        
        res[n - 1] = sum;
        for(int i = n - 1; i >= 1; i--){
            sum -= arr[i];
            res[i - 1] = sum;
        }
        
        return res;
        
    }
}