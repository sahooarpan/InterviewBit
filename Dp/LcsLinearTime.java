class LcsLinearTime 
{
	public static int lcs(String str1,String str2)
	{
		int m=str1.length();
		int n=str2.length();
		int bi=0;

		int dp[][]=new int[2][n+1];
		for (int i=0;i<=m;i++ ) {
			bi=i&1;
			for (int j=0;j<=n ;j++ ) {
				if(i==0 || j==0)
					dp[bi][j]=0;
				else if (str1.charAt(i-1)==str2.charAt(j-1)) {
					dp[bi][j]=dp[1-bi][j-1]+1;
				}
				else{
				dp[bi][j]=Math.max(dp[1-bi][j],dp[bi][j-1]);	

				}
			}
			
		}
		for (int i=0;i<2;i++ ) {
			for (int j=0;j<=n ;j++ ) {
				System.out.print(dp[i][j]+" ");
				
			}
			System.out.println();
			
		}

		return dp[bi][n];


	}
	public static void main(String[] args) {
		String X = "AGGTAB";
        String Y = "GXTXAYB";
        System.out.println(lcs(X,Y));
	}
	
}