public class recursion2 {

	int  PrintFib(int n)   
	{   
		
	  if(n<=1)
	  {
		  return n;
	  }
	  else
	  {
		  return PrintFib(n-1)+PrintFib(n-2);
	  }
	}

     int  printArray(int a[], int n)
     {
    	 
    	 
    	  if(n==a.length)
    	  {
    		  return a.length;
    	  }
    	 
    	  else
    	  {
    		  System.out.println(a[n]);
    		  return printArray(a,n+1);
    		  
    	  }
    	 
    	 
     }


    public static void main(String []args){
        recursion2 m=new recursion2();
        for(int i=0;i<=9;i++){
             System.out.println(m.PrintFib(i));
        }
      
      // System.out.println(n);
        
		int a[]= {5,7,8,3,4,6,88,90};
		
	  //  m.printArray(a,0);

    }
}
