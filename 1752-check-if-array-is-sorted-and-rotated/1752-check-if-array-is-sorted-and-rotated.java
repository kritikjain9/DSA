class Solution {
    public boolean check(int[] arr) {
        int irregularities = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[(i+1) % arr.length])
                irregularities += 1;
        }
        
        return irregularities > 1  ? false : true;
        
    }
}