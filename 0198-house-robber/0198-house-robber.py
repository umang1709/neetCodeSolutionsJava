class Solution:
    def rob(self, nums: List[int]) -> int:
        #[1,2,3,1]
        #[1,2,4,4]
        
        rob1, rob2 = 0,0
        for n in nums:
            temp = max(rob1+n,rob2)
            rob1=rob2
            rob2=temp
            
        return rob2