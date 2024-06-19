// Problem Link : https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/

import java.util.*;
public class MinimizeMaxDiffOfPairs {

    public static void main(String[] args) {
        int []nums = {10, 1, 2, 7, 1, 3};
        int p = 2;
        if(p == 0){
            System.out.println(0);
            return;
        }
        Arrays.sort(nums);
        int low = 0;
        int high = nums[nums.length-1]-nums[0];
        int res = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isValid(nums,mid,p)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(res);

    }

    public static boolean isValid(int []nums, int threshold, int p){
        int count = 0;
        int i = 0;
        while(i < nums.length-1){
            if(Math.abs(nums[i]-nums[i+1]) <= threshold){
                count++;
                i+=2;
            }
            else{
                i+=1;
            }
            if(count == p){
                return true;
            }
        }
        return false;
    }
    
}
