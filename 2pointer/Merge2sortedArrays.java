 import java.util.*;

 class Solution {
    public static ArrayList <Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
    	
    	ArrayList <Integer> res=new ArrayList <>();
    	int n1=A.size();
    	int n2=B.size();
    	int i=0,j=0,k=0;
    	while(i<n1 && j<n2)
    	{
    		if(A.get(i)<B.get(j))
    		{
    			res.set(k,A.get(i));
    			i++;
    			k++;

    		}
    		else
    		{
    			res.set(k,B.get(j));
    			j++;
    			k++;

    		}



    	}
    	while(i<n1)
    	{
    		res.set(k,A.get(i));
    			i++;
    			k++;

    	}
    	while(j<n2)
    	{
    		res.set(k,B.get(j));
    			j++;
    			k++;

    	}
    	return res;
    }
    public static void main(String[] args) {
    	ArrayList <Integer> a=new ArrayList <>();
    	ArrayList <Integer> b=new ArrayList <>();
    	a.add(1);
    	a.add(3);
    	a.add(5);
    	a.add(7);
    	b.add(2);
    	b.add(4);
    	b.add(6);
    	b.add(8);
    	//a.add(1);
    	ArrayList <Integer> res=merge(a,b);
    	for(Integer i:res)
    	{
    		System.out.println(i);


    	}
    }
}
