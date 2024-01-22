class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
         // Step 1: Build a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap to keep track of the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry::getValue)
        );

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element
            }
        }

        // Step 3: Build the result list
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Step 4: Reverse the result list to get the elements in descending order of frequency
        Collections.reverse(result);
        
        //Step 5: convert the result to array from list.
        int t = 0;
        for(int i:result){
            ans[t] = i;
            t++;
        }

        return ans;
    }
}