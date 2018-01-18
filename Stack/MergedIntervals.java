import java.util.*;
class Interval 
{
	int start;
	int end;
	Interval(int start,int end )
	{
		this.start=start;
		this.end=end;

	}
	
}
class MergedIntervals  
{
	public static List <Interval> merge(List <Interval> intervals)
	{
		List <Interval> res=new ArrayList <>();
		if(intervals==null || intervals.size()==0)
			return null;
		Collections.sort(intervals,new Comparator <Interval> ()
		{
			public int compare(Interval i1,Interval i2)
			{
				if(i1.start!=i2.start)
				return i1.start-i2.start;
				else
					return i1.end-i2.end;

			}
		});
		Interval prev=intervals.get(0);
		for(int i=1;i<intervals.size();i++)
		{
			Interval curr=intervals.get(i);
			if(curr.start>prev.end)
			{
				res.add(prev);
				prev=curr;

			}
			else
			{
				Interval merged=new Interval(prev.start,Math.max(curr.end,prev.end));
				prev=merged;

			}

		}
		res.add(prev);
		return res;

	}
	public static void main(String[] args) {
		List <Interval> intervals=new ArrayList<>();
		intervals.add(new Interval(1,6));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(15,18));
		List <Interval> res=merge(intervals);
		for (Interval i:res ) 
		{
			System.out.print(i.start + "  "+i.end);
			System.out.println();
			
		}
	}
	
}