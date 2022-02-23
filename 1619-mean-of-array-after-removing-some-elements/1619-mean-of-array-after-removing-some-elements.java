class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int fiveP = len/20;
        
        int start = fiveP, end = len - fiveP;
        int res = 0, count = 0;
        while(start < end){
            res += arr[start];
            count++;
            start++;
        }
        
        double ress = res, countt = count;
        
        // return (double)(res/count);
        return ress/countt;
    }
}