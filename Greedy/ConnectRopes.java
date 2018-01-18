import java.util.*;
class ConnectRopes 
{
	static int minCost(int arr[],int n)
	{
		PriorityQueue <Integer> pq=new PriorityQueue <>();
		for (int i=0;i<n ;i++ ) {
			pq.add(arr[i]);
			
		}
		int res=0;
		while (pq.size()>1) 
		{
			//Extract 2 shortest ropes.
			int first=pq.poll();
			int second=pq.poll();

			res+=first+second;
			pq.add(first+second);
			
		}
		return res;


	}

	public static void main(String[] args) {
		int arr[]={4,3,2,6};
		System.out.println(minCost(arr,arr.length));
	}


	
}