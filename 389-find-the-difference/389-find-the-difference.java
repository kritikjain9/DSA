class Solution {
    
    public int sum(String str){
        int sum = 0;
        for(char c : str.toCharArray())
            sum += c;
        return sum;
    }
    
    public char findTheDifference(String s, String t) {
        return (char)(sum(t) - sum(s));
    }
}