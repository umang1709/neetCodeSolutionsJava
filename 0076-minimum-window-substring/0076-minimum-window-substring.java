class Solution {
    public String minWindow(String s, String t) {
        //using sliding window strategy with variable window size
        
        //sliding window initializations
        int start = 0;
        int minLen = s.length()+1;
        int matched = 0;
        int substr = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        //putting in map the string which needs to be matched with bigger string
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        //traversing the string with sliding window strategy
        for(int end = 0;end<s.length();end++){
            //increasing the count of matched counter
            char right = s.charAt(end);
            if(map.containsKey(right)){
                //if character in bigger string is matched with 
                //character in map(i.e. char in smaller string)
                //decr counter in the map and increase the matched count if that string counter
                //came to 0
                map.put(right,map.get(right)-1);
                if(map.get(right) == 0)matched++;
            }
            
            while(matched == map.size()){
                //having while loop till map size is equal to matched count
                //as with matched count we are depicting mapSize(i.e. all characters are matched or not
                
                if(minLen > end - start + 1){
                    //we are incrementing the minLen if it is greater than window size 
                    minLen = end - start + 1;
                    //initializing the substr variable with start (i.e. start of the window)
                    substr = start;
                }
                
                //this is some what confusing part as we are removing/deleting the characters here from front of window by incrementing the start 
                //and checking if that char is concerned or not i.e. if that char is in map or not 
                //if it is in map and count of that char == 0 then matched will be -- (as matching count will decr now after deleting that character)
                //also increasing the counter of character in map as we need to match that character again in upcoming window as we are removing it from current
                char deleted = s.charAt(start++);
                if(map.containsKey(deleted)){
                    if(map.get(deleted) == 0)matched--;
                    map.put(deleted, map.get(deleted)+1);
                }
            }
        }
        //at last we are returning the result empty if minLen is still greater than length of string else returning substring, from substr to substr+minLen
        return minLen > s.length() ? "" : s.substring(substr, substr+minLen);
    }
}