package pure_storage;

public class Google_themistake {
	# Enter your code here. Read input from STDIN. Print output to STDOUT
	def express_eval(string, index, nums):
	    sub = 0    
	    while(string[index]!=")" and index<len(string)):
	        if string[index]=='(':
	            index+=1
	            numstemp = []
	            index = express_eval(string, index, numstemp)
	            nums.append(numstemp[0])
	        else:
	            if string[index]=="SUB":
	                sub = 1
	            elif string[index]=="ADD":
	                sub = 0
	            else:
	                nums.append(string[index])
	        index+=1
	   # print nums
	    
	    first = int(nums.pop(0))
	    if sub == 1:
	        while len(nums)>0:
	            first = first-int(nums.pop(0))
	    else:
	        while len(nums)>0:
	            first = first+int(nums.pop(0))
	    nums.append(first)
	    return index

	def main():
	    ilist = []
	    while True:
	        try:
	            inpi = raw_input()
	            ilist.append(inpi)
	        except EOFError:
	            break
	    for i in ilist:
	        i = i.split()
	        nums=[]
	        express_eval(i,1, nums)
	        print nums[0]

	main()      
}
