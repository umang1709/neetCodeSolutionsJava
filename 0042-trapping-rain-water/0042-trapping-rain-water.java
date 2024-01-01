class Solution {
    public int trap(int[] height) {
        if(height.length == 0)return 0;
        int left,right,leftMax,rightMax,res;
        left = res = 0;
        right = height.length-1;
        leftMax = height[0];
        rightMax = height[height.length-1];
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                res+=leftMax-height[left];
            }else {
                right--;
                rightMax = Math.max(rightMax,height[right]);
                res+=rightMax-height[right];
            }
        }
        return res;
    }
}