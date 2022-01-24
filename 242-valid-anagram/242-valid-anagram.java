class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(hms.containsKey(ch)){
                hms.put(ch, hms.get(ch)+1);
            }else{
                hms.put(ch, 1);
            }
        }
        
        for(char ch : t.toCharArray()){
            if(!hms.containsKey(ch))
                return false;
            else
                hms.put(ch, hms.get(ch)-1);
            
            if(hms.get(ch) == 0)
                hms.remove(ch);
            
        }
        
        if(hms.size() == 0)
            return true;
        else
            return false;
        
//         HashMap<Character, Integer> hmt = new HashMap<>();
//         for(char ch : t.toCharArray()){
//             if(hmt.containsKey(ch)){
//                 hmt.put(ch, hmt.get(ch)+1);
//             }else{
//                 hmt.put(ch, 1);
//             }
//         }
        
//         // Set<Character> set = hm.keySet();
//         for(char key : hms.keySet()){
//             if(hms.get(key) != hmt.get(key))
//                 return false;
//         }
        
       // return true; 
    }
}