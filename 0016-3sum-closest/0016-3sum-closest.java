class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int res = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high){
                res = nums[i] + nums[low] + nums[high];
                int diff = Math.abs(target - res);
                
                if(res == target)
                     return res;
                
                if(diff < min){
                    min = diff;
                    ans = res;
                }
                
                if(res < target)
                    low++;
                
                else
                    high--;
            }
        }
        return ans;
    }
}