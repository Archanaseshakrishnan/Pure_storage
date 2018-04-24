package pure_storage;

public class Zappos_maze {
	def function1(matrix):
	    start_col = -1
	    start_row = -1
	    m = len(matrix)
	    n = len(matrix[0])
	    for i in range(m):
	        for j in range(n):
	            if matrix[i][j]=='S':
	                start_col = j
	                start_row = i
	                break
	    path = ""
	    visited = [[0 for x in range(n)] for y in range(m)]
	    return function2(path,matrix,start_row,start_col,m,n,visited)

	def function2(path,matrix,i,j,m,n,visited):
	    if i>=0 and i<m and j>=0 and j<n and visited[i][j]!=1:
	        visited[i][j]=1
	        if matrix[i][j]=='F':
	            return path
	        elif matrix[i][j]=='@':
	            return "-1"
	        else:
	            #either s or +
	            pathnew = path[:]
	            up = function2(pathnew+"U",matrix,i-1,j,m,n,visited)
	            down = function2(pathnew+"D",matrix,i+1,j,m,n,visited)
	            right = function2(pathnew+"R",matrix,i,j+1,m,n,visited)
	            left = function2(pathnew+"L",matrix,i,j-1,m,n,visited)
	            nl = []
	            if up != "-1":
	                nl.append(up)
	            if down != "-1":
	                nl.append(down)
	            if right != "-1":
	                nl.append(right)
	            if left != "-1":
	                nl.append(left)
	            return min_len(nl)
	    else:
	        return "-1"

	def min_len(nl):
	    if len(nl)<=0:
	        return "-1"
	    elif len(nl)==1:
	        return nl[0]
	    else:
	        mini = 999999
	        word = "-1"
	        for i in nl:
	            if len(i)<mini:
	                mini = len(i)
	                word = i
	        return word
	        
	matrix = [['S','+','@','@'],['+','@','+','F'],['+','+','+','+']]
	function1(matrix)
	   
}
