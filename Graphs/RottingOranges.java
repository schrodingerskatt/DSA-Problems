import java.util.*;

public class RottingOranges {

	public static int minTimeToRot(int[][] grid, int n, int m) {
		n = grid.length;
		m = grid[0].length;
		 Queue<int[]> q = new LinkedList<>();
		int fresh = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(grid[i][j] == 1){
					fresh++;
				}
				else if(grid[i][j] == 2){
					q.offer(new int[]{i,j});
				}
			}
		}

		int count = 0;
		int [][]dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		while(!q.isEmpty() && fresh != 0){
			count+=1;
			 int sz = q.size();
			for(int i = 0; i < sz; i++){
				int []rotten = q.poll();
				int r = rotten[0];
				int c = rotten[1];
				for(int []dir: dirs){
					int newr = r+dir[0];
					int newc = c+dir[1];
					if(0 <= newr && newr < n && 0 <= newc && newc < m && grid[newr][newc] == 1){
						grid[newr][newc] = 2;
						q.offer(new int[]{newr, newc});
						fresh-=1;
					}
				}
			}
		}
		return fresh == 0 ? count: -1;
	}

}