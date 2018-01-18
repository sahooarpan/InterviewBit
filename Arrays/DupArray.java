public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for (int i = 0; i < a.size(); i++){
	        if (map.get(a.get(i)) == null){
	            map.put(a.get(i), i);
	        }else{
	            return a.get(i);
	        }
	    }
	    
	    return -1;
	    
	}

}
