class Solution {
    public int mySqrt(int num) {
        if(num < 2)
            return num;
        
        if(num == 2 || num == 3)
            return 1;
        
        //1 < square_root < num/2;
        int st = 0, end = num/2;
        while(st <= end){
            int sqRoot = st + (end - st)/2;
            long res = (long) sqRoot * sqRoot;
            
            if(res == num)
                return sqRoot;
            else if(res > num)
                end = sqRoot - 1;
            else
                st = sqRoot + 1;
        }
        return end;
    }
}