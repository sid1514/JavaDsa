public class recursion {
    int printN(int n){
        if(n==1){
            return 1;
        }else{
            
            return n*printN(n-1);
        }
    }

   int showArr(int a[],int i){
        if(i==0){
            System.out.println(a[0]);
            return 0;
        }else{
            System.out.println(a[i]);
            return showArr(a,i-1);
        }
    }

      int calPower(int p, int b)
	{
	    	 int f=1;
	    	 for(int i=1;i<=p;i++)
	    	 {
	    		 f=f*b;
	    	 }
	    	 return f;
	}

    void fib(int n)
	   {
		   int a=0,b=1,c,i;
		  
		   
		   System.out.println(a+ " ");
		   System.out.println(b + " ");
		   for( i=1;i<=n-2;i++)
		   {
			   
			   c=a+b;
			   System.out.println(c);
			   a=b;
			   b=c;
		   }
		   
		   
		}
	 
	   boolean isPrime(int n)
	   {
		   boolean flag=true;
		   for(int i=2;i<=n/2;i++)
		   {
			   if(n%i==0)
			   {
				   flag=false;
				   break;
			   }
		   }
		   
		   return flag;
		   
		   
		}
	
    public static void main(String []args){
        recursion r=new recursion();
        int s1=r.printN(5);
        System.out.println(s1);
        int a[]={33,22,11,44,66};
        r.showArr(a, a.length-1);

         int n=5;  
        int f=1; 
        int i=1;    
        while(n>=i){
            f=n*f;
            n--;
        }
        System.out.println("factorial  "+ f);
//==================================================================
        int p=2,b=3;
		int f1=r.calPower(p, b);
		System.out.println("power "+ f1);
        System.out.println("fibbinico series ");
        r.fib(5);
        int c=0;
        while(i<=100){
            if(r.isPrime(i)==true){
                c++;
            }
            i++;
        }

        System.out.println("total prime number: "+c);
       
        
    }
}
