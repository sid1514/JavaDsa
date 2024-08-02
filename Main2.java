//import java.util.*;

public class Main2 {
    Node head;
     Main2 addAtLast(Main2 list ,int info)
      {
    	  
    	  Node ptr=new Node(info);
    	  
    	  if(head==null)
    	  {
    		  head=ptr;
    	  }
    	  else
    	  {
    		  Node temp=head;
    		  while(temp.link!=null)
    		  {
    			  temp=temp.link;
    		  }
    		  
    		  temp.link=ptr;
    		  
    	  }
    	  
    	  return list ;
      }

      Main2 addAtBeg(Main2 list, int info)
     {
    	 Node ptr=new Node(info);
    	 if(head==null)
    	 {
    		 head=ptr;
    	 }
    	 else
    	 {
    		 ptr.link=head;
    		 head=ptr;
    	 }
    	 
    	 return list;
    	 
    
     }

     Main2 delAtLast(Main2 list)
     {
    	 Node temp,save=null;
       if(head==null)
       {
    	   System.out.println("empty ");
       }
       else
       {
    	   temp=head;
    	   while(temp.link!=null)
    	   {
    		   save=temp;
    		   temp=temp.link;
    	   }
       
       
       
       save.link=null;
       temp=null;
       
       } 
    	return list; 
    	 
     }


     Main2 delAtBeg(Main2 list)
     {
    	 Node temp;
    	 if(head==null)
    	 {
    		 System.out.println("empty");
    	 }
    	 else
    	 {
    		 temp=head;
    		 head=head.link;
    		 temp=null;
    	 }
    	 return list;
     
     }

	 Main2 delAtPos(Main2 list, int pos)
       {
		
    	if(head==null)
    	   {
    		   System.out.println("under flow");
    	   }
    	   else
    	   {
    		  int i=1;
    		   Node temp=head,save=null;
    		   
    		   while(temp.link!=null && i<pos)
    		   {
    			   save=temp;
    			   temp=temp.link;
    			   i++;
    		   }
    		   
    		   save.link=temp.link;
    		   temp=null;
    	   }
    	   
    	   
    	   
    	   return list;
       }

     void show(Main2 list)
     { Node temp;
        int c=0;
    	 for(temp=head;temp!=null;temp=temp.link)
    	 {
    		 temp.show();
             c++;
    	 }
         System.out.println("number of element "+ c);
    	 
     }
     
	 void showN(Main2 list,int pos)
	{
		int i=1;
		Node temp=head;
		while(temp.link!=null)
		{
			if(i==pos){
 			System.out.println(temp.info);
			
		}
	       i++;
			temp=temp.link;
		}
	
	}
     int midNode(Main2 list ){
		int ptr;
		Node temp = head;
		int c=0;
		while(temp.link!=null)
		{
			temp=temp.link;
			c++;
			
		}
		int mid=(1+c)/2;
		return mid;
	 }


	 void showMiddle()
	{
		Node temp1=head,temp2=head;
		while(temp2.link!=null)
		{
			temp1=temp1.link;
			temp2=temp2.link;
			temp2=temp2.link;
		
		
		}
		System.out.println(temp1.info);
		
		
		
		
	}
	public static void main(String[] args) {
         Main2 m = new Main2();
     m=m.addAtLast(m, 0);
	 
     m=m.addAtLast(m, 2);
     m=m.addAtLast(m, 5);
     m=m.addAtLast(m, 7);
     m=m.addAtLast(m, 9);
     m=m.addAtLast(m, 3);
     m=m.addAtLast(m, 4);
     m=m.addAtBeg(m, 10);
	 m=m.addAtBeg(m, 11);
	  m.show(m);
	  System.out.println("\n");
    //m=m.delAtLast(m);
     //m=m.delAtBeg(m);
	 //m=m.delAtPos(m,2 );
     m.show(m);
	m.showN(m,2);
       
	int mid=m.midNode(m);

System.out.println("\n");
		m.showN(m,mid);
  m.showMiddle();
       
}      
        
        
}

	    
	  