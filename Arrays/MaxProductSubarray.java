//Problem Link : https://www.naukri.com/code360/problems/maximum-product-subarray_1115474?interviewProblemRedirection=true&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

import java.util.*;
public class MaxProductSubarray{
    public static void main(String args[]){

    }
    	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		int prod = 1;
		int maxima = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			prod*=arr.get(i);
			maxima = Math.max(prod, maxima);
			if(prod == 0){
				prod = 1;
			}
		}
		prod = 1;
		for(int i = n-1; i >=0; i--){
			prod*=arr.get(i);
			maxima = Math.max(maxima, prod);
			if(prod == 0){
				prod = 1;
			}
		}
		return maxima;
	}
}