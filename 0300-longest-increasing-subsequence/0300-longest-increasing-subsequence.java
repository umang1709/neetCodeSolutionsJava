class Solution {
    public int lengthOfLIS(int[] nums) {
        //using to solve this problem in O(n^2)
        int[] lis = new int[nums.length];
        Arrays.fill(lis,1);
        int maxsoFar = 1;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    lis[i]=Math.max(lis[i], 1+lis[j]);
                }
            }
            maxsoFar = Math.max(lis[i], maxsoFar);
        }
        return maxsoFar;
    }
}