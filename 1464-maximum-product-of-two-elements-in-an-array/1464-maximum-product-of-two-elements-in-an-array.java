class Solution {
    public int maxProduct(int[] arr) {
        if(arr.length == 2){
            return (arr[0] - 1) * (arr[1] - 1);
        }
        
        Arrays.sort(arr);
        int n = arr.length;
        
        return (arr[n - 2] - 1) * (arr[n-1] - 1);
        
    }
}