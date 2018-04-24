package pure_storage;

public class Tesla {
	static int maxdist;
	static int left1;
	static int right1;
public static void main(String args[]){
	int[] A={10,0,8,2,-1,12,11,3};
	System.out.println(solution(A));
}
public static int solution(int[] A){
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int i=0;i<A.length;i++){
		if(A[i]>max){
			max = A[i];
		}
		if(A[i]<min){
			min = A[i];
		}
	}
	if(min==max){
		return 0;
	}
	else{
		int[] A2=new int[max-min+1];
		/*System.out.println(min);
		System.out.println(max);
		*/
		for(int i=0;i<A.length;i++){
			//System.out.println(A[i]);
			if(min<0){
			A2[A[i]+Math.abs(min)]=1;	
			}
			else{
			A2[A[i]]=1;
			}
		}
		/*for(int i=0;i<A2.length;i++){
			System.out.println(A2[i]);
		}*/
		//System.out.println(A2.length-1);
		
		for(int i=0;i<A2.length;i++){
			if(A2[i]==0){
				
			}
		}
		int count = 0, left = -1, max1 =Integer.MIN_VALUE, result=0;
		for(int i=0;i<A2.length;i++){
			if(A2[i]==0){
				count+=1;
				if(left==-1){
					left = i;
				}
			}
			else{
				if(count>max1){
					max1 = count;
					result = (left+i)/2;
					left = -1;
					count = 0;
				}
			}
		}
		//System.out.println(result);
		//dividenconquer(A2, 0, A2.length-1,0);
		return result-1;
	}
	
}
private static int dividenconquer(int[] A, int left, int right,int count) {
	// TODO Auto-generated method stub
	if(left<=right && right<A.length && left>=0){
		int mid = (right-left+1)/2;
		mid = left+mid;
		if(A[mid]==0){
			int count1= count+1;
			int l = dividenconquer(A,left, mid-1,count1);
			int r = dividenconquer(A, mid+1, right, count1);
			if (l!= -1){
				if(r!=-1){
					if(count1+l+r>maxdist){
						maxdist = count1+l+r;
						left = mid -l;
						right = mid + r;
						
					}
					return count1+l+r;
				}
				else{
					if(count1+l>maxdist){
						maxdist = count1+l;
						left1 = mid - l;
						right1 = mid;
						
					}
					return count1+l;
				}
			}
			else{
				if(r!=-1){
				if(count1+r>maxdist){
					maxdist = count1+r;
					left1 = mid;
					right1 = mid;
					
				}
				return count1+r;
				}
				else{
					return count1;
				}
			}
				
		}
		else{
			int l = dividenconquer(A,left, mid-1,count);
			int r = dividenconquer(A, mid+1, right, count);
			return Math.max(l, r);
		}
	}
	return count;
}
}
