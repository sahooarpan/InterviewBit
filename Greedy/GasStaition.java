import java.util.*;
class GasStaition 
{
	static int CanComplete(List <Integer> gas,List <Integer> cost)
	{
		int curr_rem=0;
		int rem=0;
		int start=0;
		int total=0;
		for (int i=0;i<gas.size() ;i++ ) {
			rem=gas.get(i)-cost.get(i);
			if(curr_rem>=0)
			{
				curr_rem+=rem;

			}
			else {
				curr_rem=rem;
				start=i;
			}
			total+=rem;
			
		}
		return (total>=0)?start:-1;

	}
	public static void main(String[] args) {
		List <Integer> gas=new ArrayList <>();
		gas.add(1);
		gas.add(2);
		List <Integer> cost=new ArrayList <>();
		cost.add(2);
		cost.add(1);
		System.out.println(CanComplete(gas,cost));
	}
	
}