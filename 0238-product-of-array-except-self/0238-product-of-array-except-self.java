class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] ans = new int[nums.length];
        
        
     //left product right product strategy is used here
      
     //calc. left product, from left to right and store in result
     //to multiply it with right product to get final result
    //imagine/code by taking simple example like {1,2,3,4}
    
     //step1: calc. left product
     int left = 1;
     for(int i=0;i<nums.length;i++){
         ans[i] = left;
         left *= nums[i];
     }
     //left product{1,1,2,6}
     //step2: cal. right product and update final ans.
     int right = 1;
     for(int j=nums.length-1;j>=0;j--){
         ans[j] *= right;
         right *= nums[j]; //right product {24,12,4,1}
     }
      //final answer  {24,12,8,6}
        return ans;
    }
}