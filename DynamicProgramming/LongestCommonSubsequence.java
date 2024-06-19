// Problem Link : https://www.naukri.com/code360/problems/longest-common-subsequence_624879?interviewProblemRedirection=true&practice_topic%5B%5D=Dynamic%20Programming&company%5B%5D=Goldman%20Sachs&leftPanelTabValue=SUBMISSION

public class LongestCommonSubsequence{

    public static int lcs(String s, String t) {
    int [][]dp = new int[s.length()+1][t.length()+1];
    for(int i = dp.length-2; i >=0; i--){
        for(int j = dp[0].length-2; j >=0; j--){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1 == ch2){
                dp[i][j] = 1+dp[i+1][j+1];
            }
            else{
                dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
    }
    return dp[0][0];
}
}