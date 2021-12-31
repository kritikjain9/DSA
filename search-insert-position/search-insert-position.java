class Solution {
    public int searchInsert(int[] arr, int tar) {
        if(arr.length == 1 && tar == arr[0])
            return 0;
        
        if(tar < arr[0])
            return 0;
        
        for(int i = 0; i < arr.length; i++){
            if(tar == arr[i])
                return i;
            
            if(tar < arr[i])
                return i;
        }
        return arr.length;
    }
}