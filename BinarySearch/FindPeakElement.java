// Problem Link : https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {

    public static void main(String[] args) {
        int []nums = {1,2,1,3,5,6,4};
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if((mid-1 >=0 && nums[mid] > nums[mid-1])&&(mid+1 < nums.length && nums[mid] > nums[mid+1])){
                ans = mid;
                break;
            }
            if(nums[mid] < nums[mid+1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
    
}
