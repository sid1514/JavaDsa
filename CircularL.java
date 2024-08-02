public class CircularL {
    
	  Node head;
	  
	  void addAtLast( int info)
	  {
		  Node ptr=new Node(info);
		  
		  if(head==null)
		  {
			  head=ptr;
			  ptr.link=head;
		  }
		  else
		  {
			  Node temp=head;
			  while(temp.link!=head)
			  {
				  temp=temp.link;
			  }
			  temp.link=ptr;
			  ptr.link=head;
			  
			
		  }
		  
		  
		}

         void addAtBeg(int info)
	   {
		Node ptr=new Node(info);
		if(head==null)
		{
			head=ptr;
			ptr.link=head;
			
		}else
		{
			ptr.link=head;
			
			Node temp=head;
			while(temp.link!=head)
			  {
				temp=temp.link;
			  }
			  
			temp.link=ptr;
			
			head=ptr;
		}
			
       }		
			
    
       void delAtLast()
	  {
		  if(head==null)
		  {
			  System.out.println("under flow..");
		  }
		  else
		  {
			  
			  Node temp=head,save=null;
			  while(temp.link!=head)
			  {
				  save=temp;
				  temp=temp.link;
				  
			  }
			  save.link=head;
			  
			  temp=null;
			  
			  
			  
			  
		  }
	  }

      void delAtBeg()
	  {
		  if(head==null)
		  {
			  System.out.println("under flow");
		  }
		  else
		  {
			  Node temp1,temp2;
			  temp2=head;
			  temp1=head;
			  head=head.link;
			  while(temp2.link!=head)
			  {
				  temp2=temp2.link;
			  }
			  temp2.link=head;
			  temp1=null;
			  
			  
			  
			  
			  
			  
		  }
	  }

	   void show()
	   {
		   Node temp;
		   for(temp=head;temp.link!=head;temp=temp.link)
		   {
			   System.out.println(temp.info);
		   }
	   }
	  
	  
	  
	  
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularL list = new CircularL();
		list.addAtLast(1);
		list.addAtLast(4);
		list.addAtLast(6);
		list.addAtLast(8);
		list.addAtLast(9);
		list.addAtLast(10);
		list.addAtLast(12);
        list.addAtBeg(55);
        list.delAtLast();
        list.delAtBeg();
		list.show();
		
		
		
		

        
        
        
        
        

        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		

	}
}
