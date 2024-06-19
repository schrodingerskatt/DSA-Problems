// Problem Link : https://www.naukri.com/code360/problems/rod-cutting-problem_800284?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM

public class RodCuttingProblem {
    public static void main(String[] args) {
        int n = 8;
        int []price = {3, 5, 8, 9, 10, 17, 17, 20};

        int[]nprice = new int[price.length+1];
        for(int i = 0; i < price.length; i++){
            nprice[i+1] = price[i];
        }
        int[]dp = new int[nprice.length];
        dp[0] = 0;
        dp[1] = nprice[1];
        for(int i = 2; i < dp.length; i++){
            dp[i] = nprice[i];
            int left = 1;
            int right = i-1;
            while(left <= right){
                if(dp[left]+dp[right] > dp[i]){
                    dp[i] = dp[left]+dp[right];
                }
                left++;
                right--;
            }
        }
        System.out.println(dp[dp.length-1]);
    }
    
}
