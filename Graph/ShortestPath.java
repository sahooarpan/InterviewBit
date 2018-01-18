import java.util.*;
import java.io.*;
class ShortestPath  
{
	static final int V=4;
	static final int INF=Integer.MAX_VALUE;

	int shortestPath(int graph[][],int u,int v,int k)
	{
		int sp[][][]=new int[V][V][k+1];
		for (int e=0;e<=k ;e++ ) {
			for (int i=0;i<V ;i++ ) {//for source.
				
				for (int j=0;j<k ;j++ ) {//for dest
					sp[i][j][e]=INF;
					if(e==0 && i==j)
						sp[i][j][e]=0;
					if(e==1 && graph[i][j]!=INF)
						sp[i][j][e]=graph[i][j];
					if(e>1)
					{
						for (int a=0;a<V ;a++ ) 
						{
							if(graph[i][a]!=INF && i!=a && j!=a && sp[i][j][e-1]!=INF)
							sp[i][j][e]=Math.min(sp[i][j][e],sp[i][j][e-1]+graph[i][a]);	

						}

					}

				}
			}
			
		}
		return sp[u][v][k];


	}
	
}