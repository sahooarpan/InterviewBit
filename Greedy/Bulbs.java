import java.util.*;
class Bulbs {
	 public static int bulbsUtil(ArrayList<Integer> a) 
	 {
	 	int ans=0;
	 	if(a.get(0)==0)
	 		ans++;
	 	for (int i=1;i<a.size() ;i++ ) 
	 	{
	 		if(a.get(i-1)!=a.get(i))
	 			ans++;
	 		
	 	}
	 	return ans;
	 }
	 public static void main(String[] args) {
	 	ArrayList <Integer> bulbs=new ArrayList <>();
	 	bulbs.add(0);
	 	bulbs.add(1);
	 	bulbs.add(0);
	 	bulbs.add(1);
	 	System.out.println(bulbsUtil(bulbs));
	 }
	
}