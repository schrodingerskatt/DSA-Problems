//Problem Link : https://leetcode.com/problems/maximal-square/description/

class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int ans = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int [][]dp = new int[n][m];
        for(int c = 0; c < m; c++){
            dp[0][c] = matrix[0][c]-'0';
            ans = Math.max(ans, dp[0][c]);
        }
        for(int r = 0; r < n; r++){
            dp[r][0] = matrix[r][0]-'0';
             ans = Math.max(ans, dp[r][0]);
        }
        
        for(int r = 1; r < n; r++){
            for(int c = 1; c < m; c++){
                if (matrix[r][c]=='1'){
                    dp[r][c] = 1+Math.min(dp[r-1][c-1],Math.min(dp[r-1][c],dp[r][c-1]));
                     ans = Math.max(ans,dp[r][c]);
                }
                
            }
        }
    return ans*ans;    
    }
}