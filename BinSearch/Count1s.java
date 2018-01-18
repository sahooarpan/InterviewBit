class Count1s  
{
	static int getFirstOne(int arr[],int left,int right)
	{
		if(right>=left)
		{
			int mid=(left+right)/2;
			if((mid==0 || arr[mid-1]==0) && arr[mid]==1)
				return mid;
			if(arr[mid]==0)
				return getFirstOne(arr,mid+1,right);
			return getFirstOne(arr,left,mid-1);


		}
		return -1;

	}

	static  int count1s(int arr[],int size)
	{
		int res=getFirstOne(arr,0,size-1);
		if(res==-1)
		return 0;
		else
		return size-res; 

	}

	public static void main(String[] args) {
		int arr[]={0,0,0,1,1,1,1,1};
		System.out.println(count1s(arr,arr.length));
	}
	
}