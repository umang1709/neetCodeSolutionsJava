class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1)return Integer.valueOf(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
           System.out.println(s);
           if(s.equals("+")) {stack.push(stack.pop() + stack.pop()); }
           else if(s.equals("*")){ stack.push(stack.pop()*stack.pop()); }
           else if(s.equals("-")){int val1 = stack.pop(); int val2=stack.pop(); stack.push(val2-val1);}
           else if(s.equals("/")){int val1 = stack.pop(); int val2=stack.pop(); stack.push(val2/val1);}
           else { stack.push(Integer.valueOf(s));}
        }
        return stack.pop();
    }
}