class Solution {
    public int longestConsecutive(int[] nums) {
        //using set and streak strategy
        if(nums.length==1)return 1;
        Set<Integer> set = new HashSet<>();
        int longestStreak = 0;
        //step1: creating set to keep all unique numbers
        for(int i:nums)set.add(i);
        //step2: now iterating over set count the streak
        for(int num: set){
            if(!set.contains(num-1)){//if it is start of the streak.
                int currentStreak = 1;
                int currentNum = num;
                
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
        
    }
}