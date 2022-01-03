class Solution {
    
    public char nextGreatestLetter(char[] arr, char tar) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int res = -1;
        
        while(st <= end){
            int mid = (st + end) / 2;
            
            if(arr[mid] > tar){
                res = mid;
                // System.out.println(res);
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        // System.out.println(res);
        if(res == -1)
            return arr[0];
        return arr[res];
    }
}