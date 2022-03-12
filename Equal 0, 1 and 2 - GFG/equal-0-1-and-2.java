// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    // long _getSubstringWithEqual012(String str) 
    // { 
    //     // code here
    // }
    
    int getSubstringWithEqual012(String str) 
    { 
        
        int res = 0;
       int c0, c1, c2;
       c0 = 0;
       c1 = 0;
       c2 = 0;
       
       HashMap<String, Integer> map = new HashMap<>();
       String key = (c1 - c0) + "#" + (c2 - c1);
       map.put(key, 1);
    //   System.out.println(key);
        
       for(char ch : str.toCharArray()){
           if(ch == '0'){
               c0++;
           }else if(ch == '1'){
               c1++;
           }else{
               c2++;
           }
           
           key = (c1 - c0) + "#" + (c2 - c1);
           if(!map.containsKey(key)){
               map.put(key, 1);
           }else{
               res += map.get(key);
               map.put(key, map.get(key) + 1);
           }
           
           
       }  
       
        return res;
    }
} 









