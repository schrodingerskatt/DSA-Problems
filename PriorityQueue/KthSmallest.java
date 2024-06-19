import java.util.*;

//Problem Link : https://www.naukri.com/code360/problems/kth-smallest-element-in-an-unsorted-array_1170531?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

public class KthSmallest {
	public static int kthSmallestElement(ArrayList<Integer> arr, int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int ele: arr){
			pq.add(ele);
		}
		while(pq.size() > k){
			pq.remove();
		}
		return pq.peek();
	}
}