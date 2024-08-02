import java.util.ArrayList;
public class QuickSort{
     
	int partition(int a[],int l, int h)
	{
		
		
		int i=l+1,j=h,c=l,temp;
		while(i<=j)
		{
			
			while(i<=h && a[i]<a[c])
			{
				i++;
			}
			while( a[j]>a[c] && j>l)
			{
				j--;
			}
			
			if(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else
				break;
			
		}
		
		temp=a[c];
		a[c]=a[j];
		a[j]=temp;
			
			
			
	    return j;		
			
	
		
		
	}
	
	 void  Sort(int a[], int l, int h)
	  {
		  
		 if(l<h)
		 {
			 int m= partition(a,l,h);
			 Sort(a,l,m-1);
			 Sort(a,m+1,h);
			 
		 }
		 
		
		 
	  }
	
	
	
	
	
	public static void main(String[] args) {
	    QuickSort m =new QuickSort();
		int a[]= {9,3,90,5,65,6,2,7,8,12,34};
		int n=a.length-1;
		m.Sort(a,0,n);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		




	
		ArrayList <Integer>al=new ArrayList<>();
		int coins[]= {2000,500,200,100,50,20,10,5,2,1};
		int c=0;
		int amt=13767;
		for(int i=0;i<coins.length;i++)
		{
			if(coins[i]<=amt)
			{
			while(coins[i]<=amt)
			{
			c++;
			al.add(coins[i]);
			amt=amt-coins[i];
			}
		}
		}
				
				
				
				
				
				
			
		
		
		
		System.out.println(al);
		System.out.println(c);
		

	}

}
	

