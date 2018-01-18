import java.util.*;
class DistNosinWindow  
{
	public ArrayList <Integer> dNums(ArrayList <Integer> A, int k) 
	{
		HashMap <Integer,Integer> hm=new HashMap <>();
		
		ArrayList <Integer> res=new ArrayList <>();

		int dist_count=0;
		int n=A.size();
		for (int i=0;i<k;i++ ) 
		{
			if(hm.get(A.get(i))==null)
			{
				hm.put(A.get(i),1);
				dist_count++;

			}
			else
			{
				int count=hm.get(A.get(i));
				hm.put(A.get(i),count+1);

			}
			
		}
		res.add(dist_count);

		for (int i=k;i<n;i++ ) 
		{
			if(hm.get(A.get(i-k))==1)
			{
				hm.remove(A.get(i-k));
				dist_count--;

			}
			else
			{
				int count=A.get(i-k);
				hm.put(A.get(i-k),count-1);


			}

			if(hm.get(A.get(i))==null)
			{
				hm.put(A.get(i),1);
				dist_count++;

			}
			else
			{
				hm.put(A.get(i),hm.get(A.get(i))+1);

			}

			res.add(dist_count);

			
		}
		return res;

	}
	
}