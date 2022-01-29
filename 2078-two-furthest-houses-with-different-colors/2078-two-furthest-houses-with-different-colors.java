class Solution {
    public int maxDistance(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j)
                    continue;
                
                if(arr[i] != arr[j]){
                    max = Math.max(max, Math.abs(i - j));
                }
            }
        }
        return max;
    }
}