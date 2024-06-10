class Solution {
    public int maxArea(int[] height) {
        //bruteForce solution
        int maxArea = Integer.MIN_VALUE;
        int currArea = 0;
        int len = height.length;
        int l,r;
        l=0;
        r = len-1;
        while(l < r){
            currArea = Math.min(height[l],height[r])*(r-l);
            maxArea = Math.max(maxArea,currArea);
            if(height[l] <= height[r]){
                l++;
            }else r--;
        }
       return maxArea;
       
    }
}