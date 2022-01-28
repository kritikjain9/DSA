class Solution {
    public boolean isValid(String exp) {
        
       Stack <Character> st = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){        
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){  
                if(st.size() == 0)return false;             
                
                else if(ch == ')' && st.peek() != '('){     //bracket mismatch
                    return false;
                }
                else if(ch == '}' && st.peek() != '{'){
                    return false;
                }
                else if(ch == ']' && st.peek() != '['){
                    return false;
                }
                st.pop();
            }
        }

        if(st.size() != 0){                                 // no. of opening B > no closing B 
            return false;
        }

        return true;
    }
}