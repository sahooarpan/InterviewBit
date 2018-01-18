import java.util.*;
class NobleInt  
{
	public static int NobleInt(int arr[])
	{
		Arrays.sort(arr);
		for (int i=0;i<arr.length-1 ;i++ ) 
		{
			if(arr[i]==arr[i+1])
				continue;
			if(arr[i]==n-i-1)
				return arr[i];

			
		}
		if(arr[arr.length-1]==0)
			return arr[arr.length-1];
		return -1;


	}
	public static void main(String args[])
    {
        int [] arr = {10, 3, 20, 40, 2};
        int res = nobleInteger(arr);
        if (res != -1)
            System.out.println("The noble integer is "+ res);
        else
            System.out.println("No Noble Integer Found");
    }
	
}