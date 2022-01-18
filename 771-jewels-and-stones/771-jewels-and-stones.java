class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        int res = 0;
        
        for(char j : jewels.toCharArray()){
            hs.add(j);
        }
        
        for(int i = 0; i < stones.length(); i++){
            if(hs.contains(stones.charAt(i)))
                res++;
        }
        return res;
    }
}