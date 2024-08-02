

public class HeapTree {
   
	void heapify(int a[], int n,int i)
	{
		
		int lar=i;
		int left=i*2+1;
		int right=i*2+2;
		
		if(left<n && a[left]>a[lar])
		{
			lar=left;
		}
		if(right<n && a[right]>a[lar])
				{
			lar=right;
				}
		
		if(lar!=i)
		{
			int temp=a[i];
			a[i]=a[lar];
			a[lar]=temp;
			
			heapify(a,n,lar);
		}
		
		
		
		
	}
	void Mheapify(int a[], int n,int i)
	{
		
		int min=i;
		int left=i*2+1;
		int right=i*2+2;
		
		if(left<n && a[left]<a[min])
		{
			min=left;
		}
		if(right<n && a[right]<a[min])
				{
			min=right;
				}
		
		if(min!=i)
		{
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			Mheapify(a,n,min);
		}
		
		
		
		
	}
	
    
	int deleteRoot(int A[], int n )
	{
		int temp=A[0];
		A[0]=A[n];
		A[n]=temp;
		n--;
		
		
		heapify(A,n,0);
		
		return n;
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {1,3,5,4,6,13,10,9,8,15,17};
		HeapTree m = new HeapTree();
		int n=a.length/2;
		
		for(int i=n;i>=0;i--)
		{
			m.heapify(a,a.length,i);
		}
		
		 for(int i=n;i>=0;i--)
		{
			m.Mheapify(a,a.length,i);
		} 

		 n= m.deleteRoot(a, a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}

