class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        int m = text1.length();
        int n = text2.length();
        for(int i= m-1; i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}