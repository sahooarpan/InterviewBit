class MaxSumWithoutAdj  
{
	static int adjacent(ArrayList<ArrayList<Integer>> a) {
		int arr[]=new int[a.get[0].size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Math.max(a.get(0).get(i),a.get(1).get(i));
		}
		int dp[]=new int[arr.length+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++)
		{

			dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i-1]);
		}
		return dp[arr.length];
	
}