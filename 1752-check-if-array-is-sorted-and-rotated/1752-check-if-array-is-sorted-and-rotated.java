class Solution {
    public boolean check(int[] arr) {
        if(arr.length == 1){
            return true;
        }
        
        int k = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[(i+1) % arr.length]){
                k++;
            }
        }
        
        return k > 1 ? false : true;
    }
}