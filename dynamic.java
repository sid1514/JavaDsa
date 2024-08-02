import java.util.LinkedList;
import java.util.Queue;

class dynamic{

     
	  int fib(int n,int DP[])
	  {
		  if(n==0)
		  {
			  return 0;
		  }
		  else if(n==1)
		  {
			  return 1;
		  }
		  
		  if(DP[n]!=-1)
		  {
			 return  DP[n]; 
		  }
		  
		  else
		  {
			  DP[n]=fib(n-1,DP)+fib(n-2,DP);
			  return fib(n-1,DP)+fib(n-2,DP);
		  }	  
		  
	  }



	
    public static void main(String args[]){
        dynamic m=new dynamic();
        int n=7;
			int DP[]= {-1,-1,-1,-1,-1,-1,-1};
			for(int i=0;i<n;i++)
			{
			  System.out.println(m.fib(i,DP));
			}

			Queue<String> queue = new LinkedList<>();

			queue.add("apple");
			queue.add("grapes");
			System.out.println(queue);

    }
}