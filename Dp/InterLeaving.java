class InterLeaving  
{
	public boolean isInterLeaving(String str1,String str2,String str3)
	{
		if(str3.length()!=str1.length()+str2.length())
			return false;
		boolean dp[][]=new boolean[str1.length()+1][str2.length()+1];
		for (int i=0;i<=str1.length();i++ ) 
		{
			for (int j=0;j<=str2.length();j++ ) 
			{
				if(i==0 && j==0)
					dp[i][j]=true;
				else if (i==0) 
				{
					dp[i][j]=dp[i][j-1] && str2.charAt(j-1)==str3.charAt(i+j-1);
					
				}
				else if (j==0) 
				{
					dp[i][j]=dp[i-1][j] && str1.charAt(i-1)==str3.charAt(i+j-1);
					
				}
				else
					dp[i][j]=(dp[i-1][j] && str1.charAt(i-1)==str3.charAt(i+j-1))||(dp[i][j-1] && str2.charAt(j-1)==str3.charAt(i+j-1));

				
			}
			
		}
		return dp[str1.length()][str2.length()];

	}
	
}