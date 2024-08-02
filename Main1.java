import java.util.*;
public class Main1 {
    void merge(int A[], int mid , int l, int h)
	{    int i,j,k=0;
		int B[]=new int[100];
		i=l;
		j=mid+1;
		k=l;
		while(i<=mid  && j<=h)
		{
			if(A[i]<A[j])
			{
				B[k]=A[i];
				i++;
				k++;
			}
			else
			{
				B[k]=A[j];
				j++;
		      k++;		
			}
		
		}
		
		
		if(i<=mid)
		{
			for(int p=i;p<=mid;p++)

		{
				B[k]=A[p];
				k++;
		}
		}
		
		
		

	
	if(j<=h)
	{
		for(int p=j;p<=h;p++)

	{
			B[k]=A[p];
			k++;
			}
	}
	
	
	for(int q=l;q<=h;q++)
	{
		A[q]=B[q];
	}
	
	
}

	
	void mergeSort(int A[], int l, int h)
	{
		
		int mid;
		if(l<h)
		{
			mid=(l+h)/2;
			mergeSort(A,l,mid);
			mergeSort(A,mid+1,h);
			
			merge(A,mid,l,h);
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
    public static void main(String a1[])
{
   
    Main1 m= new Main1();
    int A[]= {4,7,8,1,2,3,45,78,15,9};
    m.mergeSort(A, 0, 9);
    for(int i=0;i<9;i++)
    {
        System.out.println(A[i]);
    }
	
    List <PnbBank>users = new ArrayList<PnbBank>() ;
		     PnbBank pb = new PnbBank();// act no name balance 
		     Scanner sc = new Scanner(System.in);
		    pb.setActNo(101);
		    pb.setBalance(3000.9);
		    pb.setName("asha");
		    System.out.println(pb.toString());
            while(true)
            {
            	System.out.println("1....new account open ");
            	System.out.println("3.........widthdraw");
            	System.out.println("4........search by act no ..show balance ");
            	System.out.println("5..        show all the clients " );
           
            	  int  ch=sc.nextInt();
            	   if(ch==1)
            	   {
            		   PnbBank user= new PnbBank();
            		   System.out.println("enter act no");
            		   user.setActNo( sc.nextInt());
            		   sc.nextLine();
            		   System.out.println("enter name");
            		   user.setName( sc.nextLine());

            		   System.out.println("enter Balance");
 
            		   user.setBalance( sc.nextDouble());
                       users.add(user);
            	   }
            	   else if (ch==2)

                    {
            		   
            		   }
            	   else if (ch==3)
            	   {
            		   
            	   }
            	   else if(ch==4)
            	   {
            		   
            	   }
            	   else if(ch==5)
            	   {
            		   
            		   for(PnbBank b : users)
            		   {
            			   System.out.println(b.toString());
            		   }
            		   
            	   }
            	   else
            	   {
            		   break;
            	   }
            }

		
		
		
	
    }
}
