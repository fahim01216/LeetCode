class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0, end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(end < n) {
            if(map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end))+1);
            }
            map.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}