package pure_storage;

public class Intuit {
	def get_rectangle_coordinates(img):
	    M = len(img)
	    N = len(img[0])
	    visited = [[0 for i in xrange(M)] for j in xrange(M)]
	    print visited
	    res2 = []
	    for i in range(M):
	        
	        for j in range(N):
	            if img[i][j]==0:
	                list2 = []
	                dfs(img, i, j, M, N, visited, list2)
	                for k in range(len(list2)):
	                    lis = []
	                    li = list2[k]
	                    lis.append(i)
	                    lis.append(j)
	                    lis.extend(li)
	                    res.append(lis)
	     res2               
	                
	def dfs(img, i, j, M, N, visited, list2):
	    if i>=0 and i<M and j>=0 and j<N and img[i][j]==0:
	        if visited[i][j] != 1:
	            visited[i][j] = 1
	            l = dfs(img, i+1, j, M, N, visited, list2)
	            r = dfs(img, i, j+1, M, N, visited, list2)
	            if l == false and r == false:
	                li = []
	                li.append(i)
	                li.append(j)
	                list2.append(li)
	        return true
	    return false

}
