class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0,sum2 = 0, k = 0;
        int len = mat.length;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if(i == j) {
                    sum1 = sum1 + mat[i][j];
                }
                if(len > 0) {
                    sum2 = sum2 + mat[k][len - 1]; 
                    len--; 
                    k++;
                } 
            }
        }
        if(mat.length % 2 != 0) {
            return (sum1 + sum2) - mat[(mat.length - 1) / 2][(mat.length - 1) / 2];
        }
        else
        return sum1 + sum2;
    }
}
