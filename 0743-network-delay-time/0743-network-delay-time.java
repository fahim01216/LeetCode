class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        final int val = (int)1e9;
        int[] dist = new int[n+1];
        Arrays.fill(dist, val);
        dist[k] = 0;
        
        for(int i = 1; i <= n; i++) {
            for(int[] t : times) {
                int source = t[0];
                int target = t[1];
                
                dist[target] = Math.min(dist[target], dist[source] + t[2]);
            }
        }
        
        int max = -1;
        for(int i = 1; i <= n; i++) {
           if(dist[i] == val)
               return -1;
            max = Math.max(max, dist[i]);
        }
        return max;
    }
}