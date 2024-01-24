class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);//sorting array as to use 2 pointers.
        //to keep in mind that triplets should not be duplicate.
        
        for(int i = 0;i<nums.length-2;i++){//len-2 because to keep free 2 positions for left,right pointers
            
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                //checking above to make sure to not include duplicate 
                //dry run with sample example and you will know.
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length-1;
                while(left<right){
                    if(target == nums[left] + nums[right]){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        ans.add(temp);
                        //doing below to resolve issue of duplicacy in asnwer of triplets
                        while(left<right && (nums[left]==nums[left+1]))left++;
                        while(left<right && (nums[right]==nums[right-1]))right--;
                        left++;
                        right--;
                    } else if(target<nums[left] + nums[right])right--;
                      else left++;
                }
            }
            
        }
        return ans;
    }
}