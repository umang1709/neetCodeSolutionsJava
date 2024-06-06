class Solution {
    public int maxSubArray(int[] nums) {
      
        int currSum = Integer.MIN_VALUE;
        //keeping currSum and maxSum as max negative value as 
        //to 
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            if(currSum<0  )currSum = nums[i];
            else currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}