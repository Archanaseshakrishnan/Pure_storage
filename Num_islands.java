package pure_storage;
//[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
/*11000
11000
00100
00011*/

public class Num_islands {
public static void main(String[] args){
	char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','1','0','0'},{'0','0','0','0','0'}};
	System.out.println(numIslands(grid));
}
public static int numIslands(char[][] grid) {
int rows = grid.length;
    if(rows<1)
        return 0;
int cols = grid[0].length;
int[][] visited=new int[rows][cols];
int count=0;
//logic: check if the 4 positions - top, down, left, right are 1s
// we can go by bfs or dfs logic
//Stack<HashMap<Integer, Integer>> st=new Stack<HashSet<Integer>>();
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		if(grid[i][j]=='1' && visited[i][j]!=1){
			count += dfs(grid, visited, i, j, rows, cols);
		}
	}
}
return count;
}
private static int dfs(char[][] grid, int[][] visited, int i, int j,int rows, int cols){

if(visited[i][j]!=1){
	visited[i][j]=1;
	if(i-1>0){
		if(grid[i-1][j]=='1' && visited[i-1][j]!=1){
			dfs(grid, visited, i-1, j, rows, cols);
		}
	}
	if(i+1<rows){
		if(grid[i+1][j]=='1' && visited[i+1][j]!=1){
			dfs(grid, visited, i+1, j, rows, cols);
		}
	}
	if(j+1<cols){
		if(grid[i][j+1]=='1' && visited[i][j+1]!=1){
			dfs(grid, visited, i, j+1, rows, cols);
		}
	}
	if(j-1>0){
		if(grid[i][j-1]=='1' && visited[i][j-1]!=1){
			dfs(grid, visited, i, j-1, rows, cols);
		}
	}
}
return 1;
}
}
