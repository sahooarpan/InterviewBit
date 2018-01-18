class LongestValidParanthesis  
{
	public int longestValidParanthesis(String a)
	{
		int res=0;
		int n=a.length();
		Stack <Integer> stk=new Stack <>();
		stk.push(-1);
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='(')
				stk.push(i);
			else
			{
				stk.pop();
				if(!stk.isEmpty())
				{
					res=Math.max(res,i-stk.peek());

				}
				else
					stk.push(i);

			}

		}
		return  res;


	}
	
}
