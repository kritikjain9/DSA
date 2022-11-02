class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0; i < image[0].length; i++){
            reverse(image[i]);    
        }
        
        
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                int elem = image[i][j];
                if(elem == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
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