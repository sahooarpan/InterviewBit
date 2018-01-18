class InterleavingStrings  
{
	static boolean InterleavingStrings(char a[],char b[],char c[])
	{
		int m=a.length;
		int n=b.length;
		boolean il[][]=new boolean[m+1][n+1];
		if((m+n)!=c.length)
			return false;
		for(int i=0;i<=m;i++)
		{
			for (int j=0;j<=n ;j++ ) {
				if(i==0 || j==0)
					il[i][j]=true;
				else if(i==0 && b[j-1]==c[j-1])
					il[i][j]=il[i][j-1];
				else if(j==0 && a[i-1]==c[i-1])
					il[i][j]=il[i-1][j];

				else if(a[i-1]==c[i+j-1] && b[j-1]!=c[i+j-1])
					il[i][j]=il[i-1][j];
				else if(a[i-1]!=c[i+j-1] && b[j-1]==c[i+j-1])
					il[i][j]=il[i-1][j];
				else if(a[i-1]==c[i+j-1] && b[j-1]==c[i+j-1])
					il[i][j]=il[i-1][j] | il[i][j-1] ;
			}

		}
		return il[m][n];


	}
	public static void main(String[] args) {
		char a[]={'X','Y'};
		char b[]={'W','Z'};
		char c[]={'W','Z','X','Y'};
		System.out.println(InterleavingStrings(a,b,c));
	}
	
}