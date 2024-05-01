// Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchinSortedRotatedArray {

    public static void main(String[] args) {
        int []nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(nums[mid] <= nums[high]){
                if(nums[mid] < target && nums[high] >= target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else if(nums[mid] >= nums[low]){
                if(nums[mid] > target && nums[low] <= target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
    }
    
}
