//Problem Link : https://leetcode.com/problems/word-break/description/
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String>wordSet = new HashSet<>(wordDict);
        int n = s.length();
        int []dp = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i; j++){
                String check = s.substring(j,i+1);
                if(wordSet.contains(check)){
                    if(j > 0){
                        dp[i]+=dp[j-1];
                    }
                    else{
                        dp[i]+=1;
                    }
                }
            }
        }
        return dp[n-1]>0;
    }
}