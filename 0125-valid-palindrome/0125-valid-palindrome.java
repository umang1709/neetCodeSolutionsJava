class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())return true;
        //step1: build the string with only lower cases, and alphabetic characters
        StringBuilder filtered = new StringBuilder();
        for(char ch: s.toCharArray()){
            if((ch>='a' && ch<='z')||(ch>='0' && ch<='9'))filtered.append(ch);
            else if(ch>='A' && ch<='Z')filtered.append(Character.toLowerCase(ch));//here ch+'a'-'A' can be used to convert to lower case.
        }
        int l = 0;
        int r = filtered.length()-1;
        while(l<r){
            if(filtered.charAt(l)!=filtered.charAt(r))return false;
            else {l++;r--;}
        }
        return true;
    }
}