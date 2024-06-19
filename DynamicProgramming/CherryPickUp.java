import java.util.*;
import java.io.*;

// DP Approach









// Brute Force Approach (Backtracking)

public class CherryPickUp{

    static int maxCherry = 0;

    public static void cherryPick(int row, int col, int [][]arr, int csf){
        if(row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || arr[row][col] == -1){
            return;
        }
        if(row == arr.length-1 && col == arr[0].length-1){
            helper(row, col, arr, csf);
        }
        int cherries = arr[row][col];
        arr[row][col] = 0;
        cherryPick(row, col+1, arr, csf+cherries);
        cherryPick(row+1, col, arr, csf+cherries);
        arr[row][col] = cherries;
    }

    public static void helper(int row, int col, int [][]arr, int csf){

        if(row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || arr[row][col] == -1){
            return;
        }

        if(row == 0 && col == 0){
            maxCherry = Math.max(maxCherry, csf);
            return;
        }
        int cherries = arr[row][col];
        arr[row][col] = 0;
        helper(row, col-1, arr, csf+cherries);
        helper(row-1, col, arr, csf+cherries);
        arr[row][col] = cherries;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        cherryPick(0, 0, arr, 0);
        System.out.println(maxCherry);
    }
}