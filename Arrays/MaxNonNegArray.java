class MaxNonNegArray  
{
	public ArrayList <Integer> maxSet(ArrayList <Integer> arr)
	{
		long maxSum=0;
		long newSum=0;
		ArrayList <Integer> maxArray=new ArrayList <Integer> ();
		ArrayList <Integer> newArray=new ArrayList <Integer>();
		for(Integer i:a)
		{
			if(i>=0)
			{
				newSum+=i;
				newArray.add(i);

			}
			else
			{
				newSum=0;
				newArray=new ArrayList <>();

			}
			if((maxSum<newSum) || ((maxSum==newSum) && maxArray.size()<newArray.size())
			{
				maxSum=newSum;
				maxArray=newArray;

			}
		}
		return maxArray;

	}
	
}