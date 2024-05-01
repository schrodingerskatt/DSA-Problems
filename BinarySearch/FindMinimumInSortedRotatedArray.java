// Problem Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class FindMinimumInSortedRotatedArray {

    public static void main(String[] args) {
        int []nums = {3, 4, 5, 1 ,2};
        int low = 0;
        int high = nums.length-1;
        int minima = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] <= nums[high]){
                minima = Math.min(minima, nums[mid]);
                high = mid-1;
            }
            else if(nums[mid] >= nums[low]){
                minima = Math.min(nums[low],minima);
                low = mid+1;
            }
        }
    System.out.println(minima);
    }
    
}
