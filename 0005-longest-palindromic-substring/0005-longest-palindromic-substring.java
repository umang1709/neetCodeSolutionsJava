class Solution {
    public String longestPalindrome(String s) {
        //using axis orbit strategy to solve it in O(n^2) time as 
        //brute force takes O(n^3) time.(as generating all substring and checking max           
        //palindrome out of it )
        
        int strLen = s.length();
        String res= "";
        int resLength = res.length();
        if(strLen<2)return s;
        
        //checking for odd length
        for(int ax=0;ax<strLen;ax++){
            int orb = 1;
            int len = 1;
            
            //starting with an axis checking its all possible orbit
            while(ax-orb>=0 && ax+orb<strLen){
                if(s.charAt(ax-orb) == s.charAt(ax+orb)){
                    len+=2;
                    orb++;
                }else{
                    break;
                } 
            }
            //updating the result for each axis if got length from that axis which is 
            //greater than current result.
            if(res.length()<len){
                int si = ax - len/2;
                res = s.substring(si,si+len);
            }
            
            
        }
        
        //checking for even length
        for(int ax=0;ax<strLen-1;ax++){
            int orb = 1;
            int len = 0;
            
            //starting with an axis checking its all possible orbit
            while(ax-orb+1>=0 && ax+orb<strLen){
                if(s.charAt(ax-orb+1) == s.charAt(ax+orb)){
                    len+=2;
                    orb++;
                }else {
                    break;
                }
            }
            //updating the result for each axis if got length from that axis which is 
            //greater than current result.
            if(res.length()<len){
                int si = ax - len/2+1;
                res = s.substring(si,si+len);
            }
            
            
        } 
        return res;
        
        
        
        
    }
}