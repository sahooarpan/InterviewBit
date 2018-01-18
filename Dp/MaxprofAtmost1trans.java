class MaxprofAtmost1trans  
{
	static int maxProfit(int a[])
	{
		int profit=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			min=Math.min(min,a[i]);
			profit=Math.max(profit,a[i]-min);

		}
		return profit;

	}
	public static void main(String[] args) {
		int a[]={1,2};
		System.out.println(maxProfit(a));
	}
	
}