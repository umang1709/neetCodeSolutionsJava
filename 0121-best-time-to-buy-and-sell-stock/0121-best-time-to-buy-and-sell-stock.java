class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int l = 0;
        int r = 1;
        while(l < n && r < n){
            if(prices[l] <= prices[r]){max=Math.max(max,prices[r]-prices[l]);r++;}
            else if(prices[l] > prices[r]){l=r;r++;}
        }
        return max;
    }
}