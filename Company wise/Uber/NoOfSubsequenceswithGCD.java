public class NoOfSubsequenceswithGCD {

    static final int MAX = 1000; 

    public static void main(String[] args) {
        int a[] = { 3, 4, 8, 16 }; 
        int n = a.length; 
        System.out.println(countSubsequences(a, n)); 
    }

    static int func(int ind, int g, int dp[][], int n, int a[]){
        if(ind == n){
            if(g == 1){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(dp[ind][g]!=-1){
            return dp[ind][g];
        }

        int ans = func(ind+1, g, dp, n, a)+ func(ind+1, gcd(a[ind],g), dp, n, a);
        return dp[ind][g] = ans;
    }

    static int countSubsequences(int a[], int n){
        int dp[][] = new int[n][MAX];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < MAX; j++){
                dp[i][j] = -1;
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            count+=func(i+1, a[i], dp, n, a);
        }
        return count;
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }


    
}
