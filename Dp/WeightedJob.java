import java.util.Arrays;
import java.util.comparator;

class Job
{
	int start;
	int end;
	int profit;

	public Job(int s,int e,int p)
	{
		start=s;
		end=e;
		profit=p;
	}


}

class JobComparator implements Comparator <Job>
{
	public int compare(Job j1,Job j2)
	{
		return j1.end<j2.end?-1:j1.end==j2.end?0:1;

	}



}

class WeightedJobScheduling
{
	void binarySearch(Job jobs[],int index)
	{
		int l=0,high=index-1;
		int mid;
		while(l<=high)
		{
			mid=(l+high)/2;
			if(jobs[mid].end<=jobs[index].start)
			{
				if(jobs[mid+1].end<=jobs[index].start)
					start=mid+1;
				else
					return mid;

			}
			else

				high=mid-1;


		}
		return -1;

	}
	public static int findJob(Job jobs[],int i)
	{
		for(int j=i-1;j>=0;j--)
		{
			if(jobs[j].end<=jobs[i].start)
			{
				return j;

			}




		}
		return -1;


	}
	static public int schedule(Job jobs[])
	{
		Arrays.sort(jobs,new JobComparator());
		int n=jobs.length;
		Job table[]=new Job[n];
		table[0]=jobs[0].profit;
		for (int i=1;i<n ;i++ ) 
		{
			int inclProfit=jobs[i].profit;
			int l=findJob(jobs,i);
			if(l!=-1)
			{
				inclProfit+=table[l];

			}
			table[i]=Math.max(inclProfit,table[i-1]);

			
		}
		return table[n-1];

	}

	
	 public static void main(String[] args)
    {
        Job jobs[] = {new Job(1, 2, 50), new Job(3, 5, 20),
                      new Job(6, 19, 100), new Job(2, 100, 200)};
 
        System.out.println("Optimal profit is " + schedule(jobs));
    }






}