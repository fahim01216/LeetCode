class Solution {
    
    class Pair {
        char ch;
        int freq;
        
        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
    
    public String reorganizeString(String s) {
        int[] map = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }
                
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);
        
        for(int i = 0; i < 26; i++) {
            if(map[i] > 0) {
                pq.add(new Pair((char)('a' + i), map[i]));
            }
        }
                
        StringBuilder sb = new StringBuilder();
        Pair current = pq.poll();
        sb.append(current.ch);
        current.freq--;
                
        while(pq.size() > 0) {
            Pair temp = pq.poll();
            sb.append(temp.ch);
            temp.freq--;
            
            if(current.freq > 0) {
                pq.add(current);
            }
            current = temp;
        }
        
        if(current.freq > 0) {
            return "";
        }
        
        return sb.toString();
    }
}