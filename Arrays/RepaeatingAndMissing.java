 class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
   	ArrayList <Integer> res=new ArrayList <>();
   	//Hold xor of all elems and nos from 1 to n.
   	int xor1;
   	//Only single set bit of xor1.
   	int set_bit_no;

   	int x=0,y=0;

   	//Get xor of all arr elements.
   	for (Integer i:A ) 
   	{
   		xor1^=i;
   		
   	}

   	for (int i=1;i<=A.size() ;i++ ) 
   	{
   		xor1=xor1^i;
   		
   	}

   	//Get rightmost set bit in no.
   	set_bit_no=xor1 & ~(xor1-1);

   	/* Now divide elements in two sets by comparing
    rightmost set bit of xor1 with bit at same 
    position in each element. Also, get XORs of two
    sets. The two XORs are the output elements.The 
    following two for loops serve the purpose */

    for (int i=0;i<A.size();i++ ) 
    {
    	if((A.get(i) & set_bit_no)!=0)
    	
    	x=x^A.get(i);
    	else
    	y=y^A.get(i);	
    	
    }

    for (int i=1;i<=A.size();i++ ) 
    {
    	if((i & set_bit_no)!=0)
    		x=x^i;
    	else
    		y=y^i;
    	
    }
    res.add(y);
    res.add(x);
    return res;



    }
}
