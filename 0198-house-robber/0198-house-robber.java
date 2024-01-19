class Solution {
    public int rob(int[] nums) {
        //applying the formulae
        //totalMaxLootAtN = max(totalLootAt_N + totalLootTill_N-2,totalLotTill_N-1);
        //first with O(N)time and space and then just O(N) time and O(1) space.
        int len = nums.length;
        if(len<2)return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);//the recurrence relation of the problem
        }
        return dp[len-1];
    }
}