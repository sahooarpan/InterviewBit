class MajElem  
{
	static boolean isMaj(int arr[],int X)
	{
		int size=arr.length;
		int lastIndex=size%2?(size/2+1):(size/2);
		for (int index=0;index<lastIndex ;index++ ) {
			if(arr[index]==X && arr[index+size/2]==X)
				return true;

			
		}
		return false;


	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 3, 3, 10};
        int n = arr.length;
        int x = 3;
        if (isMaj(arr, x)==true)
            System.out.println(x + " appears more than "+
                              n/2 + " times in arr[]");
        else
            System.out.println(x + " does not appear more than " +
                              n/2 + " times in arr[]");
	}
	
}