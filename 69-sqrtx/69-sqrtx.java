class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        
        long st = 2, end = x;
        while(st <= end){
            long mid = st + (end - st)/2;
            long sqrt = mid * mid;
            
            if(sqrt == x){
                return (int)mid;
            }
            else if(sqrt > x){
                end = mid - 1;
            }else if(sqrt < x){
                st = mid + 1;
            }
        }
        return (int)end;
    }
}