import java.util.*;
class MicetoHole  
{
	static int mice(ArrayList <Integer> mices,ArrayList <Integer> holes)
	{
		Collections.sort(mices);
		Collections.sort(holes);
		int max=Integer.MIN_VALUE;
		for (int i=0;i<holes.size() ;i++ ) {
			if(max<Math.abs(mices.get(i)-holes.get(i)))
				max=Math.abs(mices.get(i)-holes.get(i));
			
		}
		return max;



	}

	public static void main(String[] args) {
		ArrayList <Integer> mices=new ArrayList <>();
			mices.add(4);
			mices.add(-4);
			mices.add(2);

	
		ArrayList <Integer> holes=new ArrayList <>();
		holes.add(4);
		holes.add(0);
		holes.add(5);

		
		System.out.println(mice(mices,holes));

	}
	
}