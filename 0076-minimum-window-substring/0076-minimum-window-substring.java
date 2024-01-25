class Solution {
    public String minWindow(String s, String t) {
        //using sliding window strategy with variable window size
        
        //sliding window initializations
        int start = 0;
        int minLen = s.length()+1;
        int matched = 0;
        int substr = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        //traversing the string with sliding window strategy
        for(int end = 0;end<s.length();end++){
            //increasing the count of matched counter
            char right = s.charAt(end);
            if(map.containsKey(right)){
                map.put(right,map.get(right)-1);
                if(map.get(right) == 0)matched++;
            }
            
            while(matched == map.size()){
                if(minLen > end - start + 1){
                    minLen = end - start + 1;
                    substr = start;
                }
                char deleted = s.charAt(start++);
                if(map.containsKey(deleted)){
                    if(map.get(deleted) == 0)matched--;
                    map.put(deleted, map.get(deleted)+1);
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(substr, substr+minLen);
    }
}