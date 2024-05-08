// Problem Link : https://www.naukri.com/code360/problems/minimum-path-sum_985349?interviewProblemRedirection=true&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

public class MinimumPathSum {

    public static void main(String[] args) {
        
    }

    public static int minSumPath(int[][] grid) {
    	int [][]dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[i][j];
                }
                else if(i == 0){
                    dp[i][j] = dp[i][j-1]+grid[i][j];
                }
                else if(j == 0){
                    dp[i][j] = dp[i-1][j]+grid[i][j];
                }
                else {
                    dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
    
}
