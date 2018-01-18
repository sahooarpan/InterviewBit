import java.util.*;
class StroglyConnected  
{
	private int V;
	private LinkedList <Integer> adjList[];
	StroglyConnected(int v)
	{
		V=v;
		for (int i=0;i<v ;i++ ) 
		{
			adjList[i]=new LinkedList();
			
		}
		void addEdge(int u,int v)
		{
			adjList[u].add(v);

		}
		void dfsUtil(int v,boolean visited[])
		{
			visited[v]=true;
			System.out.print(v+" ");
			Iterator <Integer> i=adjList[v].iterator();
			while(i.hasNext())
			{

			}

		}

	}
}