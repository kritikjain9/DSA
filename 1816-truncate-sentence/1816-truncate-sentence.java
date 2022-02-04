class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        
        String res = "";
        for(int i = 0; i < k; i++){
            res += words[i] + " ";
        }
        
        return res.trim();
    }
}