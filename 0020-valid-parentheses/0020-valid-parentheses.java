class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if( stack.isEmpty() && (ch == '}' || ch == ')' || ch==']') )
                return false;
            else {
                if(ch=='}' && stack.peek()=='{')
                    stack.pop();
                else if(ch==')' && stack.peek() == '(')
                    stack.pop();
                else if(ch==']' && stack.peek() == '[')
                    stack.pop();
                else stack.push(ch);
            }
        }
        return stack.isEmpty();
        
    }
}