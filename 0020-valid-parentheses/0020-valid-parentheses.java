class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0)return true;
        Stack<Character> stack = new Stack<>();

        for(Character ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
         else if(ch==')' || ch==']' || ch=='}'){
              if(!stack.isEmpty())
               {char ch1 = stack.peek();
               stack.pop();
               if((ch==')' && ch1=='(') || (ch==']' && ch1=='[') || (ch=='}' && ch1=='{'))continue;
               else return false;} else return false;
            }

        }     
        if(stack.isEmpty())return true;
        return false;
    }
}