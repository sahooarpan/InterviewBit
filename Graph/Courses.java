class Courses  
{
	int v;
	List <Integer> adj[];
	boolean visited[];
	boolean samePath[];
	boolean flag=true;
	public void addEdge(int v,int w)
	{
		adj[v].add(w);

	}

	 public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) 
	 {
	 	v=A;
	 	adj=new LinkedList[v];
	 	visited=new boolean[v];
	 	samePath=new boolean[v];
	 	for (int i=0;i<v ;i++ ) 
	 	{
	 		adj[i]=new LinkedList();
	 		
	 	}
	 	for (int i=0;i<B.size();i++ ) 
	 	{
	 		int u=B.get(i)-1;
	 		int v=C.get(i)-1;
	 		addEdge(u,v);
	 		
	 	}
	 	return dfs();

	 }
	 public int dfs()
	 {
	 	for (int i=0;i<v ;i++ ) 
	 	{
	 		if(!visited[i])
	 			dfsUtil(i);
	 		
	 	}
	 	return flag?1:0;

	 }
	 void dfsUtil(int v)
	 {
	 	visited[v]=true;
	 	samePath[v]=true;
	 	for(int w:adj[v])
	 	{
	 		if(samePath(w))
	 			flag=false;
	 		if(!visited[w])
	 			dfsUtil(w);
	 	}
	 	samePath[v]=false;

	 }

	
}