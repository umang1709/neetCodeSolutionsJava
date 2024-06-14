class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(i==nums[i])continue;
            else return i;
        }
        
        return len;
        
    }
}