class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
     
        func(ans,n,0,0,"");
        return ans;  
    }
    public void func(List<String> ans,int n, int open, int close, String curr){
     
        if(curr.length() == 2*n){ans.add(curr); return;}
        
        if(open < n)func(ans,n,open+1,close,curr+"(");
        if(close < open)func(ans,n,open,close+1,curr+")");

    }
}