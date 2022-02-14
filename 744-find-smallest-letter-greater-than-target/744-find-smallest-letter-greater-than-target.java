class Solution {
    public char nextGreatestLetter(char[] arr, char tar) {
        //this question is basically the same as when we find the ceil of an element in a sorted array
        
        //so, we will apply the same logic
        int st = 0, end = arr.length - 1;
        int res = 0;           
        
        while(st <= end){
            int mid = (st + end) / 2;
            
            if(arr[mid] > tar){
                res = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        
        //if the element is the largest in the array, then as mentioned in the question "the letters wrap around", we will simply return the first element of the array (the vaule of the variable res will not be changed)
         
        return arr[res];
    }
}