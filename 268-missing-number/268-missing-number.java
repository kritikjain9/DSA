class Solution {
    
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
    
//     public int missingNumber(int[] arr) {
//         if(arr.length == 1){
//             if(arr[0] == 1){
//                 return 0;
//             }
//             if(arr[0] == 0)
//                 return 1;
//         }
        
        
//         int idx = 0;
        
//         while(idx < arr.length){
//             if(arr[idx] == 0){
//                 idx++;
//                 continue;
//             }
            
//             int correctIdx = arr[idx] - 1;
            
//             if(arr[idx] == arr[correctIdx]){
//                 idx++;
//             }else{
//                 int temp = arr[idx];
//                 arr[idx] = arr[correctIdx];
//                 arr[correctIdx] = temp;
//             }
            
//         }
        
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == 0){
//                 return (i+1);
//             }
//         }
//         return -1;
//     }
}