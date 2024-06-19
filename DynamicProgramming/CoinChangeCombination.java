// Problem Link : https://www.naukri.com/code360/problems/ways-to-make-coin-change_630471?interviewProblemRedirection=true&practice_topic%5B%5D=Dynamic%20Programming&company%5B%5D=Goldman%20Sachs&leftPanelTabValue=SUBMISSION

public class CoinChangeCombination {

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here			

		long []dp = new long[value+1];
		dp[0] = 1;
		for(int i = 0; i < denominations.length; i++){
			for(int j = denominations[i]; j < dp.length; j++){
				dp[j]+=dp[j-denominations[i]];
			}
		}
	return dp[value];
	}
	
}