class JumpArrayII  
{
	static boolean canReach(ArrayList <Integer> a)
	{
		if(a.size()<=1)
			return true;
		int max=a.get(0);//max-largest index which can be reached.
		for (int i=0;i<a.size() ;i++ ) 
		{
			if(max<=i && a.get(i)==0)
				return false;
			if(i+a.get(i)>=max)
				max=i+a.get(i);
			if(max>=a.size()-1)
				return true;
			
		}
		return false;

	}
	
}