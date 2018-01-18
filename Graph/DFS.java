import java.util.*;
import java.io.*;
class Graph  
{
	private int V;//No of vertices.

	private LinkedList <Integer> adjList[];
	Graph(int V)
	{
		this.V=V;
		adjList=new LinkedList[V];
		for (int i=0;i<V ;i++ ) 
		{
			adjList[i]=new LinkedList();

		}
	}

	void addEdge(int src,int dest)
	{
		adjList[src].add(dest);

	}

	void dfs(int start_vertex)
	{
		boolean visited[]=new boolean[V];
		dfsUtil(start_vertex,visited);


	}
	void dfsUtil(int start_vertex,boolean visited[])
	{
		visited[start_vertex]=true;
		System.out.print(start_vertex+" ");
		Iterator <Integer> i=adjList[start_vertex].iterator();
		while (i.hasNext()) 
		{
			int n=i.next();
			if(!visited[n])
				dfsUtil(n,visited);
			
		}


	}
	public static void main(String[] args) {
	Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.dfs(2);		
	}

	
}