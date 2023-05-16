class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;
        int start = 0;
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        
        for(char c : ch) {
            freq[c - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(freq[ch[i] - 'a'] < k) {
                ans = Math.max(ans, longestSubstring(s.substring(start, i), k));
                start = i + 1;
            }
        }
        
        if(start == 0) {
            return s.length();
        }
        
        ans = Math.max(ans, longestSubstring(s.substring(start), k));
        return ans;
    }
}