class Solution {
    public int maxChunksToSorted(int[] arr) {
        // if(arr.length == 1){
        //     return 1;
        // }
        
        int[] minFromRight = new int[arr.length];
        minFromRight[arr.length - 1] = arr[arr.length - 1];
        
        for(int i = arr.length - 2; i >= 0; i--){
            minFromRight[i] = Math.min(arr[i], minFromRight[i+1]);
        }
        
        int res = 0;
        int lMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length - 1; i++){
            lMax = Math.max(lMax, arr[i]);
            
            if(lMax <= minFromRight[i+1])
                res++;
        }
        return res + 1;         //coz teen dande lagaenge toh we will have 4 partitions 
    }
}