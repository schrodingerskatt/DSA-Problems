import java.util.*;

public class CycleinDirectedGraph {
    public static boolean detectCycleInDirectedGraph(int n, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.size(); i++) {
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);
            adj.get(a).add(b);
        }

        boolean[] visited = new boolean[n+1];
        boolean[] recSt = new boolean[n+1];
        for (int i = 1; i < n+1; i++) {
            if (!visited[i]) {
                if (DFSRec(adj, i, visited, recSt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recSt) {
        visited[s] = true;
        recSt[s] = true;
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                if (DFSRec(adj, u, visited, recSt)) {
                    return true;
                }
            } else if (recSt[u]) {
                return true;
            }
        }
        recSt[s] = false;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(1, 2)));
        edges.add(new ArrayList<>(List.of(4, 1)));
        edges.add(new ArrayList<>(List.of(2, 4)));
        edges.add(new ArrayList<>(List.of(3, 4)));
        edges.add(new ArrayList<>(List.of(5, 2)));
        edges.add(new ArrayList<>(List.of(1, 3)));

        System.out.println(detectCycleInDirectedGraph(5, edges)); // Output: true
    }
}
