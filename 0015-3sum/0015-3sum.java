class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); //sorting the input array to eradicate the duplicates
        for(int i =0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
            int target = 0 - (nums[i]);
            List<List<Integer>>temp = getTwoSum(nums,target,i+1);
            if(temp.size() !=0){
                for(List<Integer> t : temp){
                    t.add(nums[i]);
                    ans.add(t);
                }
            }
        }
        return ans;
        
        
    }
    private List<List<Integer>> getTwoSum(int[] arr, int target, int j){
        int l = j;
        int r = arr.length-1;
        int[] nums = Arrays.copyOf(arr,arr.length);
        List<List<Integer>> answer = new ArrayList<>();
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum==target){
                List<Integer> tem = new ArrayList<>();
                tem.add(nums[l]);
                tem.add(nums[r]);
                answer.add(tem);
                while(l<r && nums[l]==nums[l+1])l++;
                while(l<r && nums[r]==nums[r-1])r--;
                l++;
                r--;
            }else if(sum<target)l++;
            else if(sum>target)r--;
        }
        return answer;
    }
}