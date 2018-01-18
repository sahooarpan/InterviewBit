import java.util.*;
class MinRevaesals  
{
	static int minRevaesals(String str)
	{
		int len=str.length();
		if(len%2!=0)
			return -1;
		Stack <Integer> st=new Stack <>();
		for (int i=0;i<len ;i++ ) 
		{
			char c=str.charAt(i);
			if(c=='}' && !st.isEmpty())
			{
				if(st.peek()=='{')
				st.pop();
				else
					st.push(c);

			}
			else
				st.push(c);

			
		}
		int red_len=st.size();
		int open=0;
		while(!st.isEmpty() && st.peek())
		{
			st.pop();
			open++;

		}
		int close=len-open;
		return ((open/2)+(close/2));


	}
	 public static void main(String[] args) 
    {
        String expr = "}}{{";
         
        System.out.println(minRevaesals(expr));
    }
	
}