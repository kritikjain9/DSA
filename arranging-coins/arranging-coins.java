class Solution {
    public int arrangeCoins(int n) {
        
        int temp = n, stairs = 0;
        for(int i = 1; i <= n; i++){
            if(temp - i >= 0){
                stairs += 1;
                temp -= i;
            }else{
                break;
            }
        }
        return stairs;
    }
}