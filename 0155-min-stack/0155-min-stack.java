class MinStack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    int value;
    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty()){
            if(val>minStack.peek())val=minStack.peek();
        }
        minStack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();    
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
       return minStack.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */