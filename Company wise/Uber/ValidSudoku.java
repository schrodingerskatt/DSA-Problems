public class ValidSudoku {

    public static boolean isItSudoku(int matrix[][]) {
		return solve(matrix, 0, 0);
	}
	public static boolean solve(int matrix[][], int row, int col){

		if(row == matrix.length){
			return true;
		}
		if(col == matrix[0].length){
			return solve(matrix, row+1, 0);
		}
		if(matrix[row][col] != 0){
			return solve(matrix, row, col+1);
		}
		for(int num = 1; num <= 9; num++){
			if(isValid(matrix,row,col,num)){
				matrix[row][col] = num;
				if(solve(matrix,row,col+1)){
					return true;
				}
				matrix[row][col]=0;
			}
		}
		return false;
	}

	public static boolean isValid(int matrix[][], int row, int col, int num){
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i][col] == num){
				return false;
			}
			if(matrix[row][i] == num){
				return false;
			}

			int subgridRow = 3*(row/3)+i/3;
			int subgridCol = 3*(col/3)+i%3;
			if(matrix[subgridRow][subgridCol]== num){
				return false;
			}
		}
		return true;
	}
    
}
