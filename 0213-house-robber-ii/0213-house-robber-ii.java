class Solution {
    public int rob(int[] nums) {
        if(nums.length<2)return nums[0];
        else if (nums.length==2)return Math.max(nums[0],nums[1]);
        return Math.max(helper(nums,0), helper(nums,nums.length-1));
    }

    public int helper(int[] nums, int skip){
        int r1,r2;
        r1=r2=0;
        if(skip==0){
         r1 = nums[1];
         r2 = Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){
            int temp = Math.max(nums[i]+r1, r2);
            r1 = r2;
            r2 = temp;
        }  
        }else if(skip == nums.length-1){
            r1 = nums[0];
            r2 = Math.max(nums[0],nums[1]); 
           for(int i=2;i<nums.length-1;i++){ 
               int temp = Math.max(nums[i]+r1,r2);
               r1 = r2;
               r2 = temp;
           
        } }

        return r2;
    }
}
