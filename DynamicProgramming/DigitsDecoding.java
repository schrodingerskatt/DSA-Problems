public class DigitsDecoding{
    public static int decodingDigits(String s){
        int []dp = new dp[s.length()];
        dp[0] = 1;
        if(s.charAt(0) == '0') return 0;
        for(int i = 1; i < dp.length; i++){
            if(s.charAt(i) == '0' && s.charAt(i-1) == '0'){
                dp[i] = 0;
            }
            else if(s.charAt(i-1) == '0' && s.charAt(i)!='0'){
                dp[i] = dp[i-1]%1000000007;
            }
            else if(s.charAt(i-1)!='0' && s.charAt(i) == '0'){
                if(s.charAt(i-1) == '1'||s.charAt(i-1) == '2'){
                    dp[i] = (i >= 2 ? dp[i-2]:1);
                    dp[i] = dp[i]%1000000007;
                }
            }
            else{
                if(Integer.parseInt(s.substring(i-1,i+1)) <= 26){
                    dp[i] = dp[i-1]+(i>=2 ? dp[i-2]:1)%1000000007;
                }
                else{
                    dp[i] = dp[i-1]%1000000007;
                }
            }
        }
        return dp[s.length()-1]%%1000000007;
    }
}