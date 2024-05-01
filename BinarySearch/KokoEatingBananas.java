public class KokoEatingBananas {

    public static void main(String[] args) {
        int []piles = {3, 6, 7, 11};
        int h = 8;
        int low = 1;
        int high = -1;
        for(int i = 0; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int totalHrs = 0;
            for(int i = 0; i < piles.length; i++){
                totalHrs+=Math.ceil((double)piles[i]/mid);
            }
            if(totalHrs <= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }
    
}
