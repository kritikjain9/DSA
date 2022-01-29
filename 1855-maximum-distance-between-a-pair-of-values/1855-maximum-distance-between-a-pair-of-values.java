class Solution {
    public int maxDistance(int[] a, int[] b) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++){
            int bestIdx = binarySearch(i, b, a);
            int res = bestIdx - i;
            max = Math.max(max, res);
        }
        return max;
    }
    
    public int binarySearch(int idx, int[] b, int[] a){
        int tar = a[idx];
        int st = idx, end = b.length - 1;
        int res = 0;
        
        while(st <= end){
            int mid = st + (end - st)/2;
            //check
            if(b[mid] >= tar){
                res = mid;
                st = mid + 1;
            }else{
                end = mid - 1;  
            }       
        }
        return res;
    }
    
}