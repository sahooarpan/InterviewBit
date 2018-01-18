class MissingNoAP
{
	static int findMissingElem(int arr[],int low,int high,int diff)
	{
		if(low>=high)
			return Integer.MAX_VALUE;
		int mid=(low+high)/2;
		if(arr[mid+1]!=arr[mid]+diff)
			return arr[mid]+diff;
		if(mid>0 && arr[mid]-arr[mid-1]!=diff)
			return arr[mid-1]+diff;
		if(arr[mid]==arr[0]+mid*diff)
			return findMissingElem(arr,mid+1,high,diff);
		return findMissingElem(arr,low,mid-1,diff);


	}

	public static void main(String[] args) {
		int arr[]={2,4,6,8,10,14,16};
		int size=arr.length-1;
		System.out.println(findMissingElem(arr,0,size-1,2));
	}
	
}