class Solution {
    public boolean isPerfectSquare(int n) {
         
        // int res = Math.sqrt(n);
        // if(Math.sqrt(n) == (int)res){
            if(Math.sqrt(n) % 1 == 0){
            return true;
        }
        return false;
    }
}