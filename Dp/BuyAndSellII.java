public class Solution {
	public int maxProfit(final List<Integer> arr) {
	    int profit=0;
	    for(int i=1;i<arr.size();i++)
	    {
	        int diff=arr.get(i)-arr.get(i-1);
	        if(diff>0)
	        {
	            profit+=diff;
	        }
	        
	    }
	    return profit;
	    
	}
}
