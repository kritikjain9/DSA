class Solution {
    public String reverseWords(String s) {
        if(s.trim().length() == 1){
            return s.trim();
        }
        
        String[] words = s.trim().split(" +");
        String res = "";
        for(int i = words.length-1; i >= 0; i--){ 
            res += words[i] + " ";
        }
        
        return res.trim();
    }
}