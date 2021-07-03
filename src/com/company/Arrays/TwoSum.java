package com.company.Arrays;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                ans[0] = map.get(val);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
