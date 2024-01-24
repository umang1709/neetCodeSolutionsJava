class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            int tempSum = numbers[l]+numbers[r];
            if(tempSum == target)return new int[] {l+1,r+1};
            else if(tempSum < target) l++;
            else r--;
        }
      return new int[] {};
    }
}