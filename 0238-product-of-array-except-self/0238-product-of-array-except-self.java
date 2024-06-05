class Solution {
    public int[] productExceptSelf(int[] nums) {
        //using left and right product list approach
        int length = nums.length;
        int[] l = new int[length];
        int[] r = new int[length];
        int[] ans = new int[length];
        l[0] = 1;
        for(int i=1;i<length;i++){
            l[i] = nums[i-1]*l[i-1];
        }
        r[length-1] = 1;
        for(int j=length-2;j>=0;j--){
            r[j]=nums[j+1]*r[j+1];
        }

        for(int k=0;k<length;k++){
            ans[k]=l[k]*r[k];
        }
        return ans;
    }
}