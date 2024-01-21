class Solution {
    public int lengthOfLongestSubstring(String s) {
        int currLen = 0;
        int maxLen = 0;
        //using array here to keep track of duplicacy as in our input only 
        //english alphabets is there (and ASCII can get store in 1byte i.e. 8bit i.e. 2^8 = 256 length)
        //if anything can be there then will need to use unicode i.e. 2byte i.e. 2^16 (64k length boolean arr)
        boolean set[] = new boolean[256];
        int i,j;
        i=0;
        j=-1;
        while(i<s.length()){
            char ch_acq = s.charAt(i);
            //detect duplicacy then release it.
            while(set[ch_acq]){
                j++;
                char ch_rel = s.charAt(j);
                set[ch_rel] = false;
            }
            //acquiring the char
            set[ch_acq] = true;
            
            //computing and updating length
            currLen = i - j; // it will give (j,i] length like j=-1,i=2 (2-(-1)=3 as j is released its not included 
            if(currLen>maxLen)maxLen=currLen; //in the window)
            i++;
        }
       return maxLen; 
    }
}
//brute force can be O(n^3) TC
//will use SW, acquire and release strategy.
//imagine an ex(with explanations and diagrams) during coding it can help.
