class Solution {
    public boolean canJump(int[] nums) {
        int steps = 0;
        for(int i = 0; i < nums.length-1; i++){
            steps--;
            if(nums[i] == 0 && steps <= 0)
                return false;
            else if(nums[i] > steps)
                steps = nums[i];
        }
        return true;
    }
}