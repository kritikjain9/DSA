class Solution {
    public boolean checkIfPangram(String str) {
        HashSet<Character> hs = new HashSet<>();
        
        for(char ch : str.toCharArray())
            hs.add(ch);
        
        return (hs.size() == 26) ? true : false;
        
    }
}