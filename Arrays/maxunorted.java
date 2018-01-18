public class Solution {
   public ArrayList<Integer> subUnsort(ArrayList<Integer> arr) {
	
		ArrayList <Integer> res=new ArrayList<>();
		int n=arr.size();
		int start=0,end=n-1,i;
		for(i=0;i<n-1;i++)
		{
			if(arr.get(i)>arr.get(i+1))
				{
					start=i;
					break;
				}

		}
		 if (i == n-1)
      {
          res.add(-1);
          return res;
        
      }
		for (i=n-1;i>0 ;i-- ) 
		{
			if(arr.get(i)<arr.get(i-1))
				{
					end=i;
					break;
				}
			
		}
		int min=arr.get(start),max=arr.get(start);
		for( i=start+1;i<=end;i++)
		{
			if(arr.get(i)<min)
				min=arr.get(i);
			if (arr.get(i)>max) 
			{
				max=arr.get(i);
				
			}

		}

		for ( i=0;i<start ;i++ ) 
		{
			if(arr.get(i)>min)
				{
					start=i;
					break;
				}
			
		}
		for ( i=n-1;i>=end+1 ;i-- ) 
		{
			if(arr.get(i)<max)
			{
				end=i;
				break;
			}
			
		}
		
			res.add(start);
			res.add(end);

			
		
		return res;

}
}