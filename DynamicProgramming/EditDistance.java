// Problem Link : https://www.naukri.com/code360/problems/edit-distance_630420?interviewProblemRedirection=true&practice_topic%5B%5D=Dynamic%20Programming&company%5B%5D=Goldman%20Sachs&leftPanelTabValue=PROBLEM

public class EditDistance {

    public static int editDistance(String str1, String str2) {
        int [][]dp = new int[str1.length()+1][str2.length()+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                else if(j == 0){
                    dp[i][j] = i;
                }
                else{
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else{
                        int replace = dp[i-1][j-1]+1;
                        int insert = dp[i][j-1]+1;
                        int delete = dp[i-1][j]+1;
                        dp[i][j] = Math.min(replace, Math.min(insert, delete));
                    }
                }
            }
        }
    return dp[dp.length-1][dp[0].length-1];
    }
}