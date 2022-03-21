class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> masterList = new ArrayList<>();
      
        HashMap<String,List<String>> hm = new HashMap<>() ;
        
        for(int i = 0 ; i < strs.length ; i++)
        {
             String item = strs[i]; //string - abc
            String key = Key(item); //mapping = a1b1c1
            
            if(hm.containsKey(key)){
                List<String> al = hm.get(key);
                al.add(item);
                hm.put(key, al);
            }
            else{
                List<String> al = new ArrayList<>();
                al.add(item);
                hm.put(key, al);
            }
            
        } 
        
        for(String k : hm.keySet())
        {
             masterList.add(hm.get(k));
        }
        return masterList;
        
    }
    
    
    public String Key(String str){
         int arr [] = new int [26] ;
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            
            char ch = str.charAt(i);
            arr[ch-'a']++; 
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ;i < arr.length ; i++)
        {
            int val = arr[i];
            if(val>0)
            {
                char ch = (char)(i+'a');
                sb.append(ch);
                sb.append(val);
            }
        }
        
        return sb.toString();
        
    }
}