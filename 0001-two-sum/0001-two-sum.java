class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ans = new int[2];
       HashMap<Integer,Integer> map2 = new HashMap<>();
       int i = 0;
       for(int num: nums){
           int complement = target - num;
           if(map2.containsKey(complement)){
               ans[0]=map2.get(complement);
               ans[1]=i;
               return ans;
           }else {
               map2.put(num,i); 
               i++;
           }
       } 
       return ans;
    }
}