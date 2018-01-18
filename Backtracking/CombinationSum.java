class CombinationSum 
{
	public ArrayList <ArrayList <Integer> >combinationSum(ArrayList <Integer> candidates,int target)
	{
		ArrayList <ArrayList <Integer>> res=new ArrayList <ArrayList <Integer>>();
		if(candidates==null || candidates.size()==0)
		return res;
		Collections.sort(candidates);
		ArrayList <Integer> curr=new ArrayList <>();
		combinationSum(candidates,target,0,curr,res);
		return res; 



	}

	public void combinationSum(ArrayList <Integer> candidates,int target,int index,ArrayList <Integer> curr,ArrayList <ArrayList <Integer> >res)
	{
		if(target==0)
		{
			ArrayList <Integer> temp=new ArrayList <>(curr);
			res.add(temp);
			return;
		}

		for (int i=index;i<candidates.length;i++ ) 
		{
			if(target<candidates.get(i))
				return;
			temp.add(candidates.get(i));
			combinationSum(candidates,target-candidates.get(i),i,curr,res);
			temp.remove(curr.size()-1);
		}

	}


	
}