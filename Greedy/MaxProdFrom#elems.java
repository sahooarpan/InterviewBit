class MaxProdFrom3elems  
{
	static int MaxProd(int arr[])
	{
		int maxA=Integer.MIN_VALUE,maxB=Integer.MIN_VALUE,maxC=Integer.MIN_VALUE;
		int minA=Integer.MAX_VALUE;
		int minB=Integer.MAX_VALUE;
		for (int i=0;i<arr.length ; i++) 
		{
			if(arr[i]>maxA)
			{
				maxC=maxB;
				maxB=maxA;
				maxA=arr[i];


			}
			else if (arr[i]>maxB) 
			{
				maxC=maxB;
				maxB=arr[i];

				
			}

			else if (arr[i]>maxC) 
			{
				maxC=arr[i];

				
			}
			if(arr[i]<minA)
			{
				minB=minA;

			}
			else if (arr[i]<minB) 
			{
				minB=arr[i];
				
			}


			
		}
		return Math.max((maxA*maxB*maxC),(maxA*minB*minA));



	}
	public static void main(String[] args) {
		int arr[]={0,-1,3,100,70,50};
		System.out.println(MaxProd(arr));
	}
	
}