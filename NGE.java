import java.util.*;

public class NGE  
{
	static ArrayList <Integer> nge(int arr[])
	{
		ArrayList <Integer> res=new ArrayList <>();
		int i=0;
		int n=arr.length;
		Stack <Integer> st=new Stack <>();
		st.push(0);
		int next,top;
		for( i=1;i<n;i++)
		{
			 next=arr[i];
			 if(!st.isEmpty())
			 {
			 	top=st.pop();
			 	while(next>top)
			 	{
			 		res.add(next);
			 		if(!st.isEmpty())
			 			top=st.pop();
			 		else
			 			break;


			 	}
			 	if(top>next)
			 		st.push(top);
			 }
			 st.push(next);
			}

			while(!st.isEmpty())
			{
				int elem=st.pop();
				res.add(-1);

			}


			 

			return res;

		}
		


	
	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3 };
        //int n = arr.length;
        ArrayList<Integer> res=nge(arr);
        for (Integer i :res ) {
        	System.out.print(i+ " ");
        	
        }
	}

	
}