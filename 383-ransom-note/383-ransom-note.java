class Solution {
    public boolean canConstruct(String note, String mag) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : mag.toCharArray()){
            if(!hm.containsKey(ch)){
                hm.put(ch, 1);
            }else{
                hm.put(ch, hm.get(ch)+1);
            }
        }
        
        
        for(char ch : note.toCharArray()){
            if(hm.containsKey(ch) && hm.get(ch) > 0){
                hm.put(ch, hm.get(ch)-1);
            }
            else
                return false;
        }
        
        return true;
        
    }
}