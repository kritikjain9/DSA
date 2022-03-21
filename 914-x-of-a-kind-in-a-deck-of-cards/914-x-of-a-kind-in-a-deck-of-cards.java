class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int val : deck){
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        
        int res = 0;
        for(int i : hm.values()){
            res = gcd(i, res);
        }
        
        return res >= 2;
    }
    
    // public int gcd(int a, int b) {
    //     return b > 0 ? gcd(b, a % b) : a;
    // }
    
    public int gcd(int a, int b){
        
        while(a != 0){
            if(b > 0){
                int rem = a % b;
                a = b;
                b = rem;
            }else{
                return a;
            }
        }
        return b;
    }
    
}