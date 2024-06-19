// Problem Link : https://www.naukri.com/code360/problems/sliding-maximum_701652?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

import java.util.*;
public class SlidingMaximum {
	public static int[] maxSlidingWindow(int[] arr, int n, int k) {
        Deque<Integer>dq = new ArrayDeque<>();
		int []res = new int[n-k+1];
		int count = 0;
		for(int i = 0; i < n; i++){
			if(!dq.isEmpty() && dq.peekFirst()== i-k){
				dq.pollFirst();
			}
			while(!dq.isEmpty() && arr[i] > arr[dq.peekLast()]){
				dq.pollLast();
			}
			dq.addLast(i);

			if (!dq.isEmpty() && (i + 1) >= k) {
				res[count] = arr[dq.peekFirst()];
				count++;
            }
		}
		return res;
	}
}