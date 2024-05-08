// Problem Link : 
public class MinJumps {

    public static void main(String[] args) {
        
    }

    public static int minimumJumps(int[] arr, int N) {
        if (N == 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }

        int jumpsTaken = 1;
        int maxReach = arr[0];
        int stepsLeft = arr[0];

        for (int i = 1; i <= (N - 2); i++) {
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // We took a step to reach current index
            stepsLeft--;
            if (stepsLeft == 0) {
                jumpsTaken++;
                if (i >= maxReach) {
                    
                    // Impossible to reach the last shop
                    return -1;
                }
                stepsLeft = maxReach - i;
            }
        }
        return jumpsTaken;
    }

}
