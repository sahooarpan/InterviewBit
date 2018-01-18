import java.util.*;
class LongestCosecutiveSubseq  
{
	static int findLongestCosecutiveSubseq(int arr[])
	{
		int ans=0;
		HashSet <Integer> set=new HashSet<>();
		for (Integer i : arr) {
			set.add(i);
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(!set.contains(arr[i]-1))
			{
				int j=arr[i];
				while(set.contains(j))
				{
					j++;
				}
				if(j-arr[i]>ans)
				ans=j-arr[i];

			}
			


		}
		return ans;

	}
	public static void main(String[] args) {
		int arr[] =  {1, 9, 3, 10, 4, 20, 2};
        int n = arr.length;
        System.out.println("Length of the Longest consecutive subsequence is " + findLongestCosecutiveSubseq(arr));
	}
}