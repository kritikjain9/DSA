class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    
        HashSet<Character> hs =  new HashSet<>();
        for(char ch : allowed.toCharArray()){
            hs.add(ch);
        }
        
        int res = 0;
        
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(!hs.contains(word.charAt(i)))
                    break;
                if(i == word.length() - 1)
                    res++;
            }
        }
        return res;
    }
}