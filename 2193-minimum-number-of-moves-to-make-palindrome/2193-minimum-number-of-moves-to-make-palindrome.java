class Solution {
    public void swap(char[] s, int i, int j) {
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }
    
    public int minMovesToMakePalindrome(String s) {
        int ans = 0;
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        
        while(i < j) {
            int idx = j;
            
            if(str[i] == str[j]) {
                i++;
                j--;
            }
            
            else {
                while(str[i] != str[idx]) {
                    idx--;
                }
                
                if(i == idx) {
                    swap(str, idx, idx + 1);
                    ans++;
                    continue;
                }
                else {
                    while(idx < j) {
                        swap(str, idx, idx + 1);
                        idx++;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}