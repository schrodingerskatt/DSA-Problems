// Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/

public class SquareOfSortedArray {


    public static void main(String[] args) {
        int []nums = {-4,-1,0,3,10};
        int [] res = new int[nums.length];
        res = sortedSquares(nums);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int right = nums.length-1;
        int left = 0;
        int pos = nums.length-1;

        while(left <= right){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                result[pos] = nums[left]*nums[left];
                left++;
            }
            else{
                result[pos] = nums[right]*nums[right];
                right--;
            }
            pos--;
        }
    return result;
    }
}
