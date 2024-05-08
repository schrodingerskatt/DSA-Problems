// Problem Link : https://www.naukri.com/code360/problems/merge-k-sorted-arrays_975379?interviewProblemRedirection=true&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM

import java.util.*;
public class MergeKSortedArrays {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		ArrayList<Integer>ans = new ArrayList<>();
		PriorityQueue<Item>pq = new PriorityQueue<>(new ItemComparator());

		for(int i = 0; i < k; i++){
			Item item = new Item(kArrays.get(i).get(0), i,  0);
			pq.add(item);
		}
		while(!pq.isEmpty()){
			Item root = pq.remove();
			ans.add(root.data);
			int row = root.row;
			int col = root.col;
			if(col+1 < kArrays.get(row).size()){
				Item item = new Item(kArrays.get(row).get(col+1), row, col+1);
				pq.add(item);
			}
		}
		return ans;
	}

    private static class ItemComparator implements Comparator<Item>{
		public int compare(Item i1, Item i2){
			if(i1.data < i2.data) return -1;
			if(i1.data > i2.data) return 1;
			return 0;
		}
	}

    private static class Item{
		int data = 0;
		int row = 0;
		int col = 0;

		Item(int data, int row, int col){
			this.data = data;
			this.row = row;
			this.col = col;
		}
	}
}
