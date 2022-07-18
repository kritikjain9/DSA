class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        
        int res = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
             max = Math.max(max, arr[i]);
            
            if(max == i)res++;
        }
        
        return res;
    }
}