public class DoublyL 
{
    Node2 head;
	
	void addAtLast(int info)
	{
		Node2 ptr=new Node2(info);
		if(head==null)
		{
			head=ptr;
		}
		else
		{
			Node2 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next=ptr;
			ptr.pre=temp;
			
	
		}
	}
	
	 void addAtBeg(int info)
	 {
	 Node2 ptr=new Node2(info);
	 if(head==null)
		 {
		 head=ptr;
		 }
		 
		 else
		 {
		   ptr.next=head;
		 head.pre=ptr;
		 head=ptr;
		 }
	 
    }	 
		 

	

		
		void show()
		 {
		    for(Node2 temp=head;temp!=null;temp=temp.next)
		    {
		    	System.out.println(temp.info);
		    }
		}
		  
		
		
		
		
    
	void delAtLast()
	{
		if(head==null)
		{
			System.out.println("empty ");
		}
		else
		{
			Node2 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				
			}
			temp.pre.next=null;
			temp=null;
		}
	}
	
	
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	   DoublyL m=new DoublyL();
        m.addAtLast(1);
        m.addAtLast(2);
        m.addAtLast(3);

         m.addAtLast(4);
         m.addAtLast(5);
         m.addAtBeg(99);
          m.delAtLast();
         m.show();
	
	
	
	
	
	
	
	
	
	
	
	}

}

