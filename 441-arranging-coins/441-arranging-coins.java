class Solution {
    public int arrangeCoins(int n) {
        
        long st = 0, end = n;
        while(st <= end){
            long mid = st + (end - st) / 2;
            
            long k = mid * (mid + 1) / 2;
            if(k == n){
                return (int)mid;
            }
            
            else if(k > n){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            } 
        }
        return (int)end;
    }
}