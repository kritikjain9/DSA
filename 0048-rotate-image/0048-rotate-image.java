class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = matrix[j][i];
            }
        }
        
        for(int i = 0; i < n; i++){
            // System.out.println(Arrays.toString(arr[i]));
            reverse(arr[i]);
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
    
    public void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++; j--;
        }
    }
    
}