import java.util.* ;
import java.io.*; 

//Problem Link : https://www.naukri.com/code360/problems/maximum-subarray-sum_630526?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&attempt_status=COMPLETED
public class MaximumSubarraySum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxSum = Integer.MIN_VALUE;
		long sum = 0;
		for(int i = 0; i < n; i++){
			sum+=arr[i];
			if(sum > maxSum){
				maxSum = sum;
			}
			if(sum < 0){
				sum = 0;
			}
			if(maxSum < 0){
				maxSum = 0;
			}
		}
		return maxSum;
	}

}