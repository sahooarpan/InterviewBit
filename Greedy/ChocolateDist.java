import java.util.*;
class ChocolateDist  
{
	static int MinDiffChocolateDist(int arr[],int n,int students)
	{
		if(n==0 || students==0)
			return 0;
		Arrays.sort(arr);
		if(students>n)
			return -1;
		int minDiff=Integer.MAX_VALUE;
		int start=0,last=0;
		for (int i=0;i+students-1<n ;i++ ) 
		{
			//Diff such that diffrence between last and 1st elem of
			//this sorted subarray is minimum.
			int diff=arr[i+students-1]-arr[i];
			
			if(diff<minDiff)
			{
				minDiff=diff;
				 start=i;
				 last=i+students-1;

			}
			
		}
		return arr[last]-arr[start];
		



	}
	 public static void main(String[] args) 
    {
        int arr[] = {12, 4, 7, 9, 2, 23,
             		25, 41, 30, 40, 28,
                    42, 30, 44, 48, 43,
                   50};
                    
        int m = 7;  // Number of students
         
        int n = arr.length;
        System.out.println("Minimum difference is "+ MinDiffChocolateDist(arr, n, m));
             
    }
	
}