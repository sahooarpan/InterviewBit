class WaystoReachDestwithblockage  
{
	static final int row=4;
	static final int col=4;
	static int countPaths(int maze[][])
	{
		//Corner case.
		if(maze[0][0]==-1)
			return 0;
		//Initialise 1st col.
		for (int i=0;i<row;i++ ) 
		{
			if(maze[i][0]==0)
				maze[i][0]=1;
			else if(maze[i][0]==-1)
				break;

			
		}
		//Initialise 1st row.
		for (int i=0;i<col ;i++ ) 
		{
			if(maze[0][i]==0)
				maze[0][i]=1;
			else {
				break;
			}
			
		}
		for (int i=1;i<row ;i++ ) {
			for (int j=1;j<col ;j++ ) {
				//If blockage found,ignore.
				if(maze[i][j]==-1)
					continue;
				if(maze[i-1][j]>0)
					maze[i][j]+=maze[i-1][j];
				if(maze[i][j-1]>0)
					maze[i][j]+=maze[i][j-1];

				
			}
			
		}

		 if((maze[row-1][col-1])>0)
		 	return maze[row-1][col-1];
		 return 0;




	}
	public static void main(String[] args) {
		int maze[][]={{0,  0, 0, 0},
                       {0, -1, 0, 0},
                       {-1, 0, 0, 0},
                       {0,  0, 0, 0}};
        System.out.println(countPaths(maze));               
	}
	
}