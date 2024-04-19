class Solution {
    public int maxArea(int[] height) {
        //brute force will take O(n^2)-- by checking each pair with two nested loops.
        //optimal solution will take O(n) -- using two pointers.
        int l = 0;
        int r = height.length - 1;
        int res = Integer.MIN_VALUE;
        int area = 0;
        while(l<r){
            area = (r-l) * Math.min(height[l], height[r]);
            res = Math.max(res,area);
            if(height[l]<height[r])l++;
            else r--;
        }
        return res;
        
    }
}