import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // Max-heap for the smaller half
    private PriorityQueue<Integer> minHeap; // Min-heap for the larger half

    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max-heap (default is min-heap in Java)
        minHeap = new PriorityQueue<>(); // Min-heap
    }
    
    public void addNum(int num) {
        maxHeap.offer(num); // Add to max-heap first
        
        minHeap.offer(maxHeap.poll()); // Move the largest element of max-heap to min-heap
        
        // Ensure max-heap maintains smaller or equal size to min-heap
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll()); // Move the smallest element of min-heap to max-heap
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek(); // If max-heap size is greater, median is the root of max-heap
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0; // Otherwise, median is average of roots of both heaps
        }
    }
}

