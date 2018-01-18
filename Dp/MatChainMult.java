class MatChainMult  
{
	static int findMinCost(int arr[])
	{
		int result[][]=new int[arr.length][arr.length];
		int min=0;
		for(int len=2;len<arr.length;len++)
		{
			for (int i=0;i<arr.length-len ;i++ ) {
				int j=i+len;
				result[i][j]=Integer.MAX_VALUE;
				for(int k=i+1;k<j;k++)
				{
					min=result[i][k]+result[k+1][j]+arr[0]*arr[k]*arr[j];
					if(min<result[i][j])
						result[i][j]=min;

				}
				
			}

		}
		return result[0][arr.length-1];

	}
	public static void main(String args[]){
        //MatrixMultiplicationCost mmc = new MatrixMultiplicationCost();
        int arr[] = {4,2,3,5,3};
        int cost = findMinCost(arr);
        System.out.print(cost);
    }
	
}