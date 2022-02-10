class Solution {
    public String mergeAlternately(String str, String st) {
        String res = "";
        
        int i = 0, j = 0;
        for(; i < str.length() && j < st.length(); i++, j++){
            res += str.charAt(i);
            res += st.charAt(j);
        }
        
        while(i < str.length()){
            res += str.charAt(i);
            i++;
        }
        
        while(j < st.length()){
            res += st.charAt(j);
            j++;
        }
        
        return res;
    }
}