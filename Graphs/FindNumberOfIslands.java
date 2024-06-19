public class FindNumberOfIslands {

    public static void main(String[]args){
        
    }

     public static int getTotalIslands(int[][] mat) 
	{
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    DFS(mat, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void DFS(int [][]mat, int i, int j){
        if(i < 0 || j < 0 || i >=mat.length || j >= mat[0].length|| mat[i][j] == 0){
            return;
        }
        mat[i][j] = 0;
        DFS(mat,i+1,j);
        DFS(mat, i-1, j);
        DFS(mat, i, j+1);
        DFS(mat, i, j-1);
        DFS(mat, i+1, j+1);
        DFS(mat, i-1, j-1);
        DFS(mat, i+1, j-1);
        DFS(mat, i-1, j+1);

    }

}
