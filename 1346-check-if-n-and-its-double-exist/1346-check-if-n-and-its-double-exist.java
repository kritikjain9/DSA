class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean flag = false;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j)continue;
                
                if(arr[i] == 2 * arr[j]){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    
    
    
    
//     public boolean checkIfExist(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         for(int i : arr){
//             if(i > max){
//                 max = i;
//             }
//         }
        
//         boolean flag = false;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] * 2 == max){
//                 flag = true;
//             }
//         }
//         return flag;
//     }
}