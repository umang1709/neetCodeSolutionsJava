class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
       
        while(start <= end){
            mid = start + (end-start)/2;
            System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target) end = mid - 1;
            else if(nums[mid] < target) start = mid + 1;
        }
        return -1;
    }
}