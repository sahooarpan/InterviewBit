import java.util.*;
class SearchRange  
{
	public static ArrayList <Integer> searchRange(final List <Integer> a,int b)
	{
		ArrayList <Integer> range=new ArrayList <>();
		range.add(a.size());
		range.add(-1);
		searchRangeUtil(a,0,a.size()-1,range,b);
		if(range.get(0)>range.get(1))
		{
			range.set(0,-1);
			range.set(1,-1);

		} 
		return range;


	}

	public static ArrayList <Integer> searchRangeUtil(final List<Integer> a,int low,int high,ArrayList <Integer> range,int b)
	{
		if(low>high)
			return null;
		int mid=(low+high)/2;
		if(a.get(mid)==b)
		{
			if(range.get(0)>mid)
			{
				range.set(0,mid);
				searchRangeUtil(a,low,mid-1,range,b);

			}
			if(mid>range.get(1))
			{
				range.set(1,mid);
				searchRangeUtil(a,mid+1,high,range,b);

			}



		}
		if(a.get(mid)<b)
		return searchRangeUtil(a,mid+1,high,range,b);
		 return searchRangeUtil(a,low,mid-1,range,b);


	}
	public static void main(String[] args) {
			List <Integer> arr=new ArrayList <>();

			arr.add(5);
			arr.add(7);
			arr.add(7);
			arr.add(8);
			arr.add(8);
			arr.add(10);
			ArrayList <Integer> res=searchRange(arr,8);
			for (Integer i :res ) {
				System.out.println(i);
				
			}
		}	
	
}