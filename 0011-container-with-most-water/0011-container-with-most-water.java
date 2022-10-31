class Solution {
    public int maxArea(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        
        int left = 0, right = arr.length - 1;
        while(left < right){
            
            int height = Math.min(arr[left], arr[right]);
            int area = height * (right - left);
            
            max = Math.max(max, area);
            
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return max;
    }
}