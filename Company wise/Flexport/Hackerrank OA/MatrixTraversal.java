import java.util.*;
public class MatrixTraversal {

public static void main(String[] args) {
    int[][] matrix = {
        {10, 20, 30, 40},
        {60, 50, 20, 80},
        {10, 10, 10, 10},
        {60, 50, 60, 50}
    };

    //(i+1, j) (i, j+1) (i+1, j+1)
;
    int dp[][] = new int[4][4];
    for(int i = 0; i < 4; i++){
        dp[0][i] = matrix[0][i];
    }

    for(int i = 1; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if(j == 0){
            dp[i][j] = matrix[i][j]+ Math.min(dp[i-1][j],dp[i-1][j+1]);
            }
            else if(j == 3){
                dp[i][j] = matrix[i][j]+Math.min(dp[i-1][j], dp[i-1][j-1]);
            }
            else{
                dp[i][j] = matrix[i][j]+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i-1][j+1]));
            }
            
        }
    }
    int result = Integer.MAX_VALUE;
    for(int i = 0; i < 4; i++){
        result = Math.min(result, dp[3][i]);
    }
    System.out.println(result);

}  
}
