import java.util.*;
 class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int getSum(List <Integer> A)
    {
    	int sum=0;
    	for (Integer i :A ) 
    	{
    		sum+=i;
    		
    	}
    	return sum;


    }
    public static int solve( List<Integer> A) 
    {
    	Collections.sort(A);
    	for (int i=1;i<A.size() ;i++ ) 
    	{
    		int temp=A.get(i);
    		A.set(i,-1*A.get(i));
    		int k=getSum(A);
    		A.set(i,-1*A.get(i));
    		int l=getSum(A);
    		if(k<l)
    		{
    			if(k>0)
    			{
    				A.set(i,-1*temp);

    			}
    			else if(l>0)
    			{
    				A.set(i,temp);

    			}


    		}

    	}
    	return getSum(A);
    }
    public static void main(String[] args) {
    	List <Integer> A=new ArrayList <>();
    	A.add(15);
    	A.add(10);
    	A.add(6);
    	System.out.println(solve(A));

    }
}
