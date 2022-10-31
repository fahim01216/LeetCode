class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        LinkedList<Integer> dequeue = new LinkedList<>();
        
        for(int i = 0; i < n; i++) {
            while(!dequeue.isEmpty() && nums[dequeue.getLast()] <= nums[i]) {
                dequeue.removeLast();
            }
            
            dequeue.addLast(i);
            
            if(i - dequeue.getFirst() >= k) {
                dequeue.removeFirst();
            }
            
            if(i >= k - 1) {
                ans[i - k + 1] = nums[dequeue.getFirst()];
            }
        }
        return ans;
    }
}