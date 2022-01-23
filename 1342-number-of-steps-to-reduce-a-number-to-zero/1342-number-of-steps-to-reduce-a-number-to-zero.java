class Solution {
    public int numberOfSteps(int num) {
        int[] count = {0};
        helper(num, count);
        return count[0];
    }
    
    public void helper(int n, int[] count){
        if(n <= 0)
            return;
        
        if(n % 2 == 0){
            count[0] += 1;
            helper(n/2, count);
        }
        else{
            count[0] += 1;
            helper(n-1, count);
        }
    }
    
}