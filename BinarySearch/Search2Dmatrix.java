// Problem Link : https://leetcode.com/problems/search-a-2d-matrix/

public class Search2Dmatrix {
    public static void main(String[] args) {
        int [][]matrix = {{1, 3, 5, 7},
                          {10, 11, 16, 20},
                          {23, 30, 34, 60}};
        int target = 23;
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row*col-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(matrix[mid/col][mid%col] == target){
                System.out.println("target found");
                break;
            }
            else if(matrix[mid/col][mid%col] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
    
}
