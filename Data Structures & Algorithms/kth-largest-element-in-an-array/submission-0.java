class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        for(Integer n : nums){
            heap.offer(n);
        }
        for(Integer i =0 ; i<k-1;i++){
            heap.poll();

        }
        return heap.poll();
    }
}
