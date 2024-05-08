public class TrappingRainWater {

    public static void main(String[] args) {
        long arr[] = {3, 0, 0, 2, 0, 4};
        int n = 6;
        int left = 0;
        int right = n-1;
        long left_max = 0;
        long right_max = 0;
        long ans = 0;

        while(left <= right){
            if(arr[left] <= arr[right]){
                if(arr[left] > left_max){
                    left_max = arr[left];
                }
                else{
                    ans+=left_max-arr[left];
                }
                left++;
            }
            else{
                if(arr[right] > right_max){
                    right_max = arr[right];
                }
                else{
                    ans+=right_max-arr[right];
                }
                right--;
            }
        }
        System.out.println(ans);
    }
    
}
