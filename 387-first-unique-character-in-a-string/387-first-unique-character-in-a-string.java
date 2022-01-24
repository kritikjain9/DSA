class Solution {
    public int firstUniqChar(String str) {
       HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(!hm.containsKey(ch)){
                hm.put(ch, 1);
            }else{
                hm.put(ch, hm.get(ch)+1);
            }
        }
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(hm.get(ch) == 1)
                return i;
        }
            
        return -1;
    }
}