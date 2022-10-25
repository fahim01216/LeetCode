class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0];
        int hi = matrix[n-1][n-1];
        
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int rank = findRank(mid, matrix);
            
            if(rank < k) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        
        return lo;
    }
    
    public int findRank(int target , int[][] matrix) {
        int n = matrix.length;
        int i = n - 1;
        int j = 0;
        int cnt = 0;
        
        while(i >= 0 && j < n) {
            if(matrix[i][j] > target) {
                i--;
            }
            else {
                cnt += i + 1;
                j++;
            }
        }
        return cnt;
    }
}