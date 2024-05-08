import java.util.* ;
import java.io.*; 
// Problem : https://www.naukri.com/code360/problems/min-heap_4691801?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&company%5B%5D=Flipkart&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
public class MinHeap {

// minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        List<Integer>list = new ArrayList<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            if(q[i][0] == 0){
                pq.add(q[i][1]);
            }
            else{
                list.add(pq.poll());
            }
        }
        if(list.isEmpty()) return new int[]{};
        int []res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
    return res;
    }
}