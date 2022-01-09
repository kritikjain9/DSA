class Solution {
    public int[] findErrorNums(int[] arr) {
        int idx = 0;
        while(idx < arr.length){
            int correctIdx = arr[idx] - 1;
            
            if(arr[idx] == arr[correctIdx]){
                idx++;
            }else{
                swap(arr, idx, correctIdx);
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                return new int[]{arr[i], (i+1)};
            }
        }
        return new int[]{-1, -1};
    }
    
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}