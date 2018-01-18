import java.util.*;
class Main
{
	public static void displaySteppingNos(int n,int m)
	
	{
		for (int i=0;i<=9 ;i++ ) 
		{
			bfs(n,m,i);
			
		}


	}
	static ArrayList <Integer> bfs(int n,int m,int num)
	{
		ArrayList <Integer> res=new ArrayList<>();
		Queue <Integer> q=new LinkedList <>();
		q.add(num);
		while(!q.isEmpty())
		{
			int stepNum=q.poll();
			if(stepNum<=m && stepNum>=n)
			{
				res.add(stepNum);

			}
			// If Stepping Number is 0 or greater
            // then m ,need to explore the neighbors

			if(stepNum==0 || stepNum>m)
				continue;
			int lastDig=stepNum%10;
			int stepNumA=stepNum*10+(lastDig-1);
			int stepNumB=stepNum*10+(lastDig+1);

			if(lastDig==0)
				q.add(stepNumB);
			if (lastDig==9) {
				q.add(stepNumA);
				
			}
			else
			{
				q.add(stepNumA);
				q.add(stepNumB);

			}



		}
		return res;


	}
	public static void main(String args[])
    {
        int n = 0, m = 21;
 
        // Display Stepping Numbers in
        // the range [n,m]
        displaySteppingNos(n,m);
    }


}