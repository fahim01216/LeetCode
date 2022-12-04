class Solution {
    public void rotate(int[][] matrix) {
        for(int j = 0; j < matrix.length; j++){
            for(int i = j; i < matrix.length; i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int i = 0, r = matrix.length - 1;
        while(i < r){
            int k = 0;
            while(k < matrix.length){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][r];
                matrix[k][r] = temp;
                k++;
            }
            i++;
            r--;
        }

    }
}