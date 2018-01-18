class FindElemOccOnceinSortedArr  
{
	public static int search(int arr[],int low,int high)
	{
		if(low>high)
			return -1;
		if(low==high)
			return arr[low];
		int mid=(low+high)/2;
		if(mid%2==0)
		{
			// If mid is even and element next to mid is
        // same as mid, then output element lies on
        // right side, else on left side
			if(arr[mid]==arr[mid+1])
			{
				return search(arr,mid+2,high);
			}
			else {
				return search(arr,low,mid);
			}

		}
		else if(arr[mid]%2==1)
			{
				if(arr[mid]==arr[mid-1])
					return search(arr,mid-2,high);
				else
					return search(arr,low,mid-1);


			}
			return -1;


		}
		public static void main(String[] args) 
    	{
        int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6};
        System.out.println(search(arr, 0, arr.length-1));



	}
	
}