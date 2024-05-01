public class ArrangingCoins {

    public static void main(String[] args) {
        int n = 8;
        int ans = arrangeCoins(n);
        System.out.println(ans);

    }

    public static int arrangeCoins(int n) {
        long low = 1;
        long high = n;
        long ans = 0;
        while(low <= high){
            long mid = low+(high-low)/2;
            long sum = mid*(mid+1)/2;
            if(sum > n){
                high = mid-1;
            }
            else if(sum < n){
                ans = mid;
                low = mid+1;
            }
            else{
                return (int)mid;
            }
        }
    return (int)ans; 
    }
}
    

