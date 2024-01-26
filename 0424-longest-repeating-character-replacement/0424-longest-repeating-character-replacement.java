class Solution {
    public int characterReplacement(String s, int k) {
        //**sliding window algorithm will be used
        //this will be dependent on an expression: j - i + 1 - maxF < k (i.e. windowSize - maxF(maxfrequency of a character) is greater than permissible k (k is changes times we can do in char))
        //as this difference windowSize - maxF is saying the count of non-matching character , so this count increase k , we need to remove char from start of window , also decr count in our arr.
        //as thinking of above tweak we can bring down this algorithm time complexity by O(n) (and this tweak may not come in interview , either you spent time or anyone given you idea or group of  )
        //people thought about it and given you/told you this tweak.
        
        
        //intialization for sliding window to apply the expression (j - i + 1 - maxF < k)
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
        
    }
}