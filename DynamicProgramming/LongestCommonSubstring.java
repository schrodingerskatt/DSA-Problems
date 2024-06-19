// Problem Link : https://www.naukri.com/code360/problems/longest-common-substring_1235207?interviewProblemRedirection=true&practice_topic%5B%5D=Dynamic%20Programming&company%5B%5D=Goldman%20Sachs&leftPanelTabValue=PROBLEM


public class LongestCommonSubstring {
    public static int lcs(String str1, String str2){
       int [][]dp = new int[str1.length()+1][str2.length()+1];
       int max = 0;
       for(int i = 1; i < dp.length; i++){
           for(int j = 1; j < dp[0].length; j++){
               char ch1 = str1.charAt(i-1);
               char ch2 = str2.charAt(j-1);
               if(ch1 != ch2){
                   dp[i][j] = 0;
               }
               else{
                   dp[i][j] = dp[i-1][j-1]+1;
               }
               if(dp[i][j] > max){
                   max = dp[i][j];
               }
           }
       }
    return max;
    }
}
