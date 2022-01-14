class Solution {
    public int finalValueAfterOperations(String[] ops) {
        int x = 0;
        for(int i = 0; i < ops.length; i++){
            String op = ops[i];
            
            if(op.equals("X++") || op.equals("++X"))
                x += 1;
            else
                x -= 1;
        }
        return x;
    }
}