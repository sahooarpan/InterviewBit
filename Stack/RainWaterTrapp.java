public class Solution {

	public int largestRectangleArea(ArrayList<Integer> a) 
	{
	    Stack <Integer> st=new Stack<>();
	    int maxArea=0;
	    int area=0;
	    int i;
	    for (i=0;i<a.size();i++ ) 
	    {
	    	if(st.isEmpty()|| a.get(st.peek())<=a.get(i))
	    	{
	    		st.push(i++);
	    	
	    	}
	    	else 
	    	{
	    		int top=st.pop();


	    			
	    	}	
	    	
	    }
	    
	}


}