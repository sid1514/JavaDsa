import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    
	  void createG(ArrayList <Edge>G[],int s)
	  {
		  for(int i=0;i<s;i++)
		  {
			  G[i]=new ArrayList<Edge>();
		  }
		  
		  G[0].add(new Edge(0,1));
          G[0].add(new Edge(0, 4));

		G[1].add(new Edge(1, 0));
		G[1].add(new Edge(1, 2));
		G[1].add(new Edge(1, 3));
		G[1].add(new Edge(1, 4));

		G[2].add(new Edge(2, 1));
		G[2].add(new Edge(2, 3));

		G[3].add(new Edge(3, 1));
		G[3].add(new Edge(3, 2));
		G[3].add(new Edge(3, 4));

		G[4].add(new Edge(4, 0));
		G[4].add(new Edge(4, 1));
		G[4].add(new Edge(4, 3));

		  
		/*   for(int i=0;i<G[3].size();i++)
		  {
			  Edge e= G[3].get(i);
			  System.out.println(e.des);
			  
		  }
        */
        }
          void BFS(ArrayList <Edge>G[],int s)
	  {
		  
          Queue<Integer> Q =  new LinkedList<>();
		  boolean vis[]=new boolean[s];
		 
		 Q.add(4);
		 while(!Q.isEmpty())
		 {
			 int c=Q.remove();
			 if(vis[c]==false)
			 {
				 System.out.println(c);
				 vis[c]=true;
				 
			 for(int i=0;i<G[c].size();i++)
			  {
				  Edge e= G[c].get(i);
				  Q.add(e.des);
				  
			  }
			 
			 
			 }
			 
			 
            }	  
		  
		  
	  }
	  
	  void DFS(ArrayList<Edge> G[],int c, boolean  vis[])
{
	 System.out.println(c);

	
	vis[c]=true;
	
	
	
	 for(int i=0; i<G[c].size();i++)
	 {
		 Edge e=G[c].get(i);
		 if(vis[e.des]==false)
		 {
			DFS(G,e.des,vis);

		 }
	
	}
}
	public static void main(String[] args) {
		

     ArrayList<Edge> G[]= new ArrayList[5];
     graph m= new graph();
     
		m.createG(G,5);
		
		//m.BFS(G, 5);
		
		
		boolean vis[]=new boolean[5];
		for(int i=0;i<5;i++)
		{
			if(vis[i]==false)
			{
				m.DFS(G,i,vis);
			}
		}


	}
}
