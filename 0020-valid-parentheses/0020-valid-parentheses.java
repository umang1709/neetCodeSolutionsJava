class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
            
           if((ch==')' || ch=='}' || ch==']') && !stack.isEmpty()){
               char c = stack.pop();
               if(ch==')' && c=='(' ||
                ch==']' && c=='[' || 
                 ch=='}' && c=='{') continue;
               else return false;
           } else if ((ch==')' || ch=='}' || ch==']' ) && stack.isEmpty())return false;
        }
        
        if(stack.isEmpty())return true;
        else return false;
    }
}