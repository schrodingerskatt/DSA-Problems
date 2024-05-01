// Problem Link : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class CapacitytoShipPackages {
    public static void main(String[] args) {
        int []weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < weights.length; i++){
            low = Math.max(low,weights[i]);
            high+= weights[i];
        }
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canShip(weights, days, mid)){
                ans = Math.min(ans, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }

    public static boolean canShip(int []weights, int days, int cap){
        int tempCap = cap;
        int ships = 1;
        for(int i = 0; i < weights.length; i++){
            if(cap-weights[i] < 0){
                ships++;
                cap = tempCap;
            }
            cap-=weights[i];
        }
    return ships <= days;
    }

}
