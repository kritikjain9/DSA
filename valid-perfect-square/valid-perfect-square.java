class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;
        
        //if 'x' is the sq. root of num, then x stricly lies in the range  1 < x < num / 2
        //so, we will take these two points as our start and end, and will then assume our result using the mid element
        
        long start = 2, end = num / 2;
        while(start <= end){
            long x = start + (end - start) / 2;
            long square = x * x;
            
            //logic
            //If square == num, then the perfect square is right here, return True
            if(square == num)
                return true;
            else if(square > num)       //decreasing the right boundary
                end = x - 1;
            else
                start = x + 1;      //increasing the left boundary
        }
        
        //if the while loop is over, that means num is not a perfect square
        return false;
    }
}