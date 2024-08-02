public class SearchTree {

	
	Node3 root;
	void addBst(int info)
	{
		
		Node3 ptr=new Node3(info);
		Node3 cur,par;
		if(root==null)
		{
			root=ptr;
			
		}
		else
		{
			
			cur=root;
			while(true)
			{
				
				par=cur;
				if(info<cur.info)
				{ 
					if(cur.left!=null)
					cur=cur.left;
					else
					{
						par.left=ptr;
						return;
					}
				}
				else
				{
				if(cur.right!=null)
				{
					cur=cur.right;
					
				}
				else
				{
					par.right=ptr;
					return;
				}
				}
				
			}		
		}
		
	}
	

    void searchBst(int info)
	{
		
        int f=0;
        Node3 cur;
		if(root==null)
		{
	      System.out.println("tree is empty ");
			
		}
		else
		{
			
			cur=root;
			while(true)
			{
				  if(cur.info==info || root==null)
				  {
					  f=1;	  
				  }
			
				if(info<cur.info)
				{ 
					if(cur.left!=null)
					cur=cur.left;
				
				}
				else
				{
				if(cur.right!=null)
				{
					cur=cur.right;
					
				}
		
				}			
				
				
				
			}
			
			
			
		}if(f==1){
                System.out.println("found");
            }else{
                System.out.println("not found");
            }
			

    }
		
		
		
		
void findMin()
{ Node3 temp=root;
	temp=root;
while(true)
{
if(temp.left==null)

break;
else
{
temp=temp.left;
}
}
System.out.println("\n"+temp.info);


}
	


	 void printInorder(Node3 node3)
	    {
	        if (node3 == null)
	            return;
	  
	       
	        printInorder(node3.left);
	  
	      
	        System.out.print(node3.info + " ");
	  
	       
	        printInorder(node3.right);
	    }
	  
	void printPreorder(Node3 node3)
	    {
	        if (node3 == null)
	            return;			
				
			System.out.print(node3.info + " ");
			printPreorder(node3.left);
	  
	       
	        printPreorder(node3.right);
	    }

	void printPostorder(Node3 node3)
	    {
	        if (node3 == null)
	            return;	
				
			printPostorder(node3.left);
				
				
			printPostorder(node3.right);
			System.out.print(node3.info + " ");
	    }
	public static void main(String[] args) {
	
     SearchTree m= new SearchTree();
     m.addBst(10);
     m.addBst(7);
     m.addBst(14);
     m.addBst(20);
     m.addBst(1);
     m.addBst(5);
     m.addBst(8);
     m.printInorder(m.root);
	 System.out.println();
	 m.printPreorder(m.root);
	 System.out.println();
	 m.printPostorder(m.root);
	 m.findMin();
     m.searchBst(9);

	 
}

}