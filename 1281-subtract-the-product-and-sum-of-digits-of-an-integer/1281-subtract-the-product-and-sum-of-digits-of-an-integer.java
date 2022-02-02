class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0, prod = 1;
        
        while(temp > 0){
            int dig = temp % 10;
            sum += dig;
            prod *= dig;
            temp = temp / 10;
        }
        return prod - sum;
    }
}