public class TrappingRainWater {

    public static long getTrappedWater(long []arr, int n) {
        long left_max = 0;
        long right_max = 0;
        int left = 0;
        int right = n-1;
        long totalAmount = 0;

        while(left <= right){
            if(arr[left] <= arr[right]){
                if(arr[left] > left_max){
                    left_max = arr[left];
                }
                else{
                    totalAmount+=left_max-arr[left];
                }
                left++;
            }
            else{
                if(arr[right] > right_max){
                    right_max = arr[right];
                }
                else{
                    totalAmount+=right_max-arr[right];
                }
                right--;
            }
        }
        return totalAmount;
    }
    
}
