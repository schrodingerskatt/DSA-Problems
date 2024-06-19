// Problem Link : https://www.naukri.com/code360/problems/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum_842494?interviewProblemRedirection=true&practice_topic%5B%5D=Dynamic%20Programming&company%5B%5D=Goldman%20Sachs&leftPanelTabValue=PROBLEM

public class ArrayPartitionWithMinimumDifference {
    public static int minSubsetSumDifference(int []arr, int n) {
       int totalSum = 0;
       for(int i = 0; i < n; i++){
           totalSum+=arr[i];
       }
       int target = totalSum;
       boolean [][]dp = new boolean[n][target+1];
       for(int i = 0; i < n; i++){
           dp[i][0] = true;
       }
       if(arr[0] <= target){
           dp[0][arr[0]] = true;
       }
       for(int i = 1; i < n; i++){
           for(int j = 1; j <= target; j++){
               boolean notTake = dp[i-1][j];
               boolean take = false;
               if(arr[i] <= j){
                   take = dp[i-1][j-arr[i]];
               }
               dp[i][j] = take|notTake;
           }
       }
       int mini = Integer.MAX_VALUE;
       for(int s1 = 0; s1 <= totalSum/2; s1++){
           if(dp[n-1][s1] == true){
               mini = Math.min(mini, Math.abs((totalSum-s1)-s1));
           }
       }
       return mini;
    }
}