class Solution {
    public int nthUglyNumber(int n) {
        int x2 = 0, x3 = 0, x5 = 0;
        int[] res = new int[n+1];
        res[0] = 1;
        for(int i = 1; i <= n; i++){
            res[i] = Math.min(2*res[x2], Math.min(3*res[x3], 5*res[x5]));
            if(res[i] % 2 == 0)
                x2++;
            if(res[i] % 3 == 0)
                x3++;
            if(res[i] % 5 == 0)
                x5++;
        }
        return res[n-1];
    }
}