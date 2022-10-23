class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int ans = 0;
        
        while(low < high){
            if(height[low] <= height[high]) {
                ans = Math.max(ans, height[low] * (high - low));
                low++;
            }
            else {
                ans = Math.max(ans, height[high] * (high - low));
                high--;
            }
        }
        return ans;
    }
}