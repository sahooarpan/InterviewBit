class GetSingleElement 
{
	static final int INT_SIZE=32;
	 public int singleNumber(final List<Integer> A) 
	 {
	 	int res=0;
	 	int x,sum;
	 	for (int i=0;i<INT_SIZE;i++ ) 
	 	{
	 		sum=0;
	 		x=(1<<i);
	 		for (int j=0;j<A.size() ;j++ ) 
	 		{
	 			if((A.get(j) &x)==1)
	 				sum++;
	 			
	 		}
	 		if((sum%3)==true)
	 			res|=x;


	 		
	 	}
	 	return res;


   	}
	
}