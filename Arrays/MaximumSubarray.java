import java.util.* ;
import java.io.*; 

//Problem Link : https://www.naukri.com/code360/problems/maximum-subarray_893296?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

public class MaximumSubarray {
	public static ArrayList<Integer> maximumsumSubarray(int n, int arr[]) {
		ArrayList<Integer>ans = new ArrayList<>();
		int left = 0;
		int right = n-1;
		int i = 0;
		int j = 0;
		int sum = 0;
		int maxima = Integer.MIN_VALUE;
		while(j < n){
			sum+=arr[j];
			if(sum > maxima){
				maxima = sum;
				left = i;
				right = j;
			}
			while(sum < 0 && i < n){
				sum-=arr[i];
				i++;
			}
			j++;
		}
		for(i = left; i <= right; i ++){
			ans.add(arr[i]);
		}
	return ans;
	}
}