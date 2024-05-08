import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    public static void main(String[] args) {
        
    }

     public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] indegree = new int[v];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<e;i++){
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);
            adj.get(a).add(b);
        }

 
        for (int i = 0; i < v; i++) {
            for (Integer edg : adj.get(i)) {
                indegree[edg]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        int count = 0; // Initialize count
        while (!q.isEmpty()) {
            Integer node = q.poll();
            ans.add(node);
            count++; // Increment count
            for (Integer it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        // Check for cycle
        if (count != v) {
            return new ArrayList<>();
        }
        return ans;
    }
    
}
