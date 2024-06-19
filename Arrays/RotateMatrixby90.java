// Problem Link : https://leetcode.com/problems/rotate-image/

class RotateMatrixby90 {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                swap1(matrix, i, j);
            }
        }
        for(int i = 0; i < n; i++){
            int r = 0;
            int c = n-1;
            while(r<=c){
                swap2(matrix, i, r, c);
                r++;
                c--;
            }
            
        }
    }

    public void swap1(int [][]matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void swap2(int [][]matrix, int i, int r, int c){
        int temp = matrix[i][r];
        matrix[i][r] = matrix[i][c];
        matrix[i][c] = temp;
    }
}