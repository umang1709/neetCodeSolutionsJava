class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> ans = new ArrayList<>();
         
        if(strs.length<2){
            List<String> a = new ArrayList<>();
            a.add(strs[0]);
            ans.add(a);
            return ans;
        }
        
    
        Map<String,List<String>> map = new HashMap<>();
        //this way its taking O(n*nlogn) time complexity
        //but if we will use Map<Map<Character,Integer>, List<String>> , it can go down to O(n) too.
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){//imagine here like if bucket is not created, need to creat a bucket first of hashmap
                
                map.put(sorted,new ArrayList<>());//here creating bucket of hashmap as list needs to be attached with each bucket.
                //now once done above , now adding values as required in particular bucket.
                map.get(sorted).add(s);
            }else map.get(sorted).add(s);        
        }
        for(Map.Entry<String,List<String>> m: map.entrySet()){
            ans.add(m.getValue());
        }
        
        return ans;
    }
}