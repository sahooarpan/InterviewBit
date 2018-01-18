
import java.util.*;
class MaxOfAllSubArrays  
{
	static ArrayList <Integer> MaxOfAllSubArrays(ArrayList <Integer> arr,int k)
	{
		int n=arr.size();
		ArrayList <Integer> res=new ArrayList <>();
		Deque <Integer> qi=new LinkedList <>();
		int i;
		for ( i=0;i<k ;i++ ) 
		{
			while (!qi.isEmpty() && arr.get(i)>=arr.get(qi.peekLast())) 
			{
				qi.removeLast();
				
			}
			qi.addLast(i);
			
		}
		for (;i<n ;i++ ) 
		{
			res.add(arr.get(qi.peek()));
			while (!qi.isEmpty() && qi.peek()<=i-k) 
			{
				qi.removeFirst();
					
			}
			while (!qi.isEmpty() && arr.get(i)>=arr.get(qi.peekLast())) 
			{
				qi.removeLast();
					
			}
			qi.addLast(i);	

			
		}
		res.add(qi.peek());
		return res;



	}
	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList <>();
		arr.add(12);
		arr.add(1);
		arr.add(78);
		arr.add(90);
		arr.add(57);
		arr.add(89);
		ArrayList <Integer> res=MaxOfAllSubArrays(arr,3);
		for (Integer i :res ) 
		{
			System.out.print(i + " ");
			
		}
		System.out.println();
	}

	
}