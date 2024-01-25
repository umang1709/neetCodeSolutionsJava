class Solution {
    public int maxArea(int[] height) {
        //two pointers solution will be used 
        //if height[l] < height[r] l++ else r--;
        //as we need max height in both right and left to have max area.
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
    while(left<right){
            int localMax = 0;
            int yAxis =  Math.min(height[left],height[right]);
            int xAxis = right - left;
            localMax = xAxis * yAxis;
            maxArea = Math.max(localMax,maxArea);
            if(height[left]<height[right])left++;
            else right--;
        }
        return maxArea;
        
    }
}