class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int n = prices.length;
        int l,r;
        l=0;r=1;
        while(r < n){
            if(prices[l]<=prices[r])
            {
                maxProfit = Math.max(maxProfit,prices[r]-prices[l]);
            }else { 
                l=r ;
                   }
            r++;
        }
        return maxProfit;
    }
}

//strategy is to use 2 pointers
//till n loop
    //have l=0, r  = 1;
    //maxProfit
   //if num[l]>=num[r]
        //l=r;r++;
  //else if (num[l]<num[r])
        //profit=num[r]-num[l]
        //maxProfit = max(profit,maxProfit);
        //r++;
        