class Solution {
    public String sortSentence(String str) {
        String[] quesArr = str.split(" ");
        String[] res = new String[quesArr.length];
        
        for(int i = 0; i < quesArr.length; i++){
            String word = quesArr[i];
            int idx = Integer.valueOf(word.charAt(word.length() - 1) - '0');
            // System.out.println()
            // String s = word.subSequence(0, word.length() - 1);
            String s = convert(word);
            res[idx - 1] = s;
        }
        
        String ans = "";
        for(String word : res){
            ans += word + " ";
        }
        return ans.trim();
    }
    
    public String convert(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.deleteCharAt(str.length() - 1).toString();
    }
    
}