class MaxGap  
{
	 public int maximumGap(final List<Integer> A) 
	 {
	 	if(A==null || A.size()<2)
	 		return 0;
	 	Collections.sort(A);
	 	int maxGap=0;
	 	for (int i=0;i<A.size()-1;i++ ) 
	 	{
	 		maxGap=Math.max(maxGap,A.get(i+1)-A.get(i));
	 		
	 	}
	 	return maxGap;


	 }
	
}