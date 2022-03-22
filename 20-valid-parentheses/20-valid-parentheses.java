class Solution {
    public boolean isValid(String str) {
        if(str.length() % 2 != 0){
            return false;
        }
        
        Stack<Character> st = new Stack<>() ;
        
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i) ;
            
            if(ch=='(' ||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                }
                //check for particular closing bracket
                if(ch == ')'){
                    if(st.size() > 0 && st.peek() != '('){
                        return false;
                    }
                }
                
                else if(ch == ']'){
                    if(st.size() > 0 && st.peek() != '['){
                        return false;
                    }
                }
                else if(ch == '}'){
                    if(st.size() > 0 && st.peek() != '{'){
                        return false;
                    }
                }
                
                    st.pop();
            }
        }
        
        if(st.size() != 0){
            return false;
        }
        
        return true;
    }
}