class GoldMine  
{
	static int getMaxGold(int gold[][])
	{
		int r=gold.length;
		int c=gold[0].length;

		int goldTable[][]=new int[r][c];
		for (int col=c-1;col>=0 ;col-- ) 
		{
			for (int row=0;row<r ;row++ ) 
			{
				int right=(col==c-1)?0:goldTable[row][col+1];
				int right_up=((row==0 || col==c-1))?0:goldTable[row-1][col+1];
				int right_down=((row==r-1)||(col==c-1))?0:goldTable[row+1][col+1];
				goldTable[row][col]=gold[row][col]+Math.max(right,Math.max(right_up,right_down));
				
			}
			
		}
		for(int i=0;i<r;i++)
		{
			for (int j=0;j<c ;j++ ) 
			{
				System.out.print(goldTable[i][j] + " ");
				
			}
			System.out.println();

		}


		int res = goldTable[0][0];
    	for (int i=1; i<c; i++)
        res = Math.max(res, goldTable[i][0]);
    return res;


	}
	public static void main(String[] args) {
		int gold[][]= { {1, 3, 1, 5},
        {2, 2, 4, 1},
        {5, 0, 2, 3},
        {0, 6, 1, 2}};
        System.out.println(getMaxGold(gold));
    

	}
	
}