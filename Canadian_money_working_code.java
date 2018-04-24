package pure_storage;

public class Canadian_money_working_code {
	def helper(coins, target, hm):
	    if target > 0:
	        if target in hm:
	            return hm[target]
	        res = 999999
	        for i in coins:
	            if target >= i:
	                count1 = helper(coins, target-i, hm)
	                count = count1[:]
	                if len(count)==1 and count[0]==-1:
	                    continue
	                else:
	                    if len(count)+1 < res:
	                        res = len(count)+1
	                        count.append(i)
	                        hm[target] = count
	        if target in hm:
	            return hm[target]
	        else:
	            return [-1]
	    elif target == 0:
	        return [0]
	    else:
	        return [-1]

	def function_driver(coins,target):
	    hm = {}
	    hm[0] = 0
	    if target == 0:
	        return 0
	    else:
	        for i in coins:
	            hm[i]=[i]
	    
	    return helper(coins, target, hm)
	    
	def make_ratio(coins,target):
	    result = function_driver(coins,target)
	    dicti = {}
	    for i in result:
	        if i in dicti:
	            val = dicti[i]
	            dicti[i] = val+1
	        else:
	            dicti[i] = 1
	    return dicti

	print make_ratio([2,5,10,50,100],567)


	    
	            
}
