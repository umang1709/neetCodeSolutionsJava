class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        //fill out last row
        for(int i=0; i<n;i++){
            dp[m-1][i]=1;
        }
        //fill out last column
        for(int i=0;i<m;i++){
            dp[i][n-1]=1;
        }
        
        //fill out each box
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
    }
}