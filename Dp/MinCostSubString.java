class MinCostSubString  
{
	static int Lis(char str1[],char str2[])
	{
		int dp[][]=new int[str1.length+1][str2.length+1];
		for (int i=0;i<=str1.length ;i++ ) {
			for (int j=0;j<=str2.length ;j++ ) {
				if(i==0 || j==0)
					dp[i][j]=0;
				else if (str1[i-1]==str2[j-1]) 
				{
					dp[i][j]=1+dp[i-1][j-1];
					
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

				}				
			}
			
		}
		return dp[str1.length][str2.length];

	}
	static int minCostSubString(char str1[],int m,char str2[],int n,int X,int Y)
	{
		int lcs=Lis(str1,str2);
		return X*(m-lcs) +Y*(n-lcs);


	}

	public static void main(String[] args) {
		char X[] = {'e','f'};
    char Y[] = {'g','h'};
    System.out.println(minCostSubString(X,X.length,Y,Y.length,10,20)); 
	
}
}