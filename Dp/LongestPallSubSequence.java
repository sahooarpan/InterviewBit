class LongestPallSubSequence  
{
	static int longestPallSubSequence(String str)
	{
		int n=str.length();
		int lps[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			lps[i][i]=1;

		}
		for(int gap=1;gap<n;gap++)
		{
			for (int i=0;i<n-gap ;i++ ) 
			{
				int j=i+gap;
				if(str.charAt(i)==str.charAt(j))
					lps[i][j]=2+lps[i+1][j-1];
				else
					lps[i][j]=Math.max(lps[i][j-1],lps[i+1][j]);
				
			}

		}
		return lps[0][n-1];
	}

	public static void main(String[] args) {
		System.out.println(longestPallSubSequence("raudra"));
	}
	
}