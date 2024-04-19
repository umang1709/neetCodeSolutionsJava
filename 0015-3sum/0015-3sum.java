class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //more simplified code::
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
            int target = 0-nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ans.add(temp);
                    while(l<r && (nums[l]==nums[l+1]))l++;
                    while(l<r && (nums[r]==nums[r-1]))r--;
                    l++;
                    r--;
                } else if(nums[l]+nums[r] > target)r--;
                  else if(nums[l]+nums[r] < target)l++;
            }
        } 
            }
        
        return ans;
    }
}