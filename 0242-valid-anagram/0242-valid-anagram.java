class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        //first solution is converting it to charArray and sorting both strings
        //and comparing them with .equals method, it will take O(nlogn)
        //O(nlogn) to sort and O(1) to check with .equals method if they are equal
        //second solution can be using int array of size 26 as given only english lowe alphabets used
        //and then updating that array with ++ in first pass and decrementing it -- in second pass i.e.
        //for first string and second string respectively 
        //at last will check if int array contains only 0 then return true else false.
        //so O(n+n+n), O(n) time will be taken.
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        
        for(int i:alpha)
            if(i>0)return false;
        
        return true;
            
    }
}