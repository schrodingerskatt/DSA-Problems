import java.util.Arrays;

public class CollectPoints {
    public static void main(String[] args) {
    int n = 3;
    int[] players = {3, 6, 7};
    int m = 4;
    int[] points = {2, 4, 7, 9};
    System.out.println(minTimeToCollectPoints(n, players, m, points));
    }

    public static int minTimeToCollectPoints(int n, int[] players, int m, int[] points) {
        Arrays.sort(players);
        Arrays.sort(points);
        int maxTime = 0;
        for(int point: points){
            int idx = Arrays.binarySearch(players, point);
            idx = idx >= 0 ? idx : -idx-1;
            int distance;
            if(idx == 0){
                distance = Math.abs(players[0]-point);
            }
            else if(idx == n){
                distance = Math.abs(players[n-1]-point);
            }
            else{
                distance = Math.min(Math.abs(players[idx]-point), Math.abs(players[idx-1]-point));
            }
            maxTime = Math.max(distance, maxTime);
        }
        return maxTime;

    }
    
}
