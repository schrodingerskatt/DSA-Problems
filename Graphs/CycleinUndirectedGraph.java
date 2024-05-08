import java.util.ArrayList;


public class CycleinUndirectedGraph {

public static void main(String[] args) {
    
}

public static String cycleDetection(int[][] edges, int n, int m) {
     
    ArrayList<Integer>[]adj = new ArrayList[n+1];
    for(int i = 1; i <= n; i++){
        adj[i] = new ArrayList<>();
    }
    
    for(int []edge:edges){
        adj[edge[0]].add(edge[1]);
        adj[edge[1]].add(edge[0]);
    }
    boolean []visited = new boolean[n+1];
    for(int i = 1; i <= n; i++){
        if(!visited[i]){
            if(DFSRec(i,-1, adj, visited)){
                return "Yes";
            }
        }
    }
    return "No";
   }

   public static boolean DFSRec(int source, int parent, ArrayList<Integer>[] adj, boolean []visited){
       visited[source] = true;
       for(int adjNode: adj[source]){
           if(!visited[adjNode]){
               if(DFSRec(adjNode, source, adj, visited)){
                   return true;
               }
           }
           else if(adjNode != parent){
               return true;
           }
       }
       return false;
   }
}
