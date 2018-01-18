class SortedInsertPosition  
{
	static int searchInsert(int a[],int val)
	{
		int n1=a.length;
		int i=0;
		int j=n1-1;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(a[mid]<val)
			{
				i=mid+1;

			}
			else if (a[mid]>val) 
			{
				j=mid-1;
				
			}
			else
				return mid;


		}
		return i;

	}
	public static void main(String[] args) {
		int arr[]={1,3,5,6};
		System.out.println(searchInsert(arr,2));
	}
	
}