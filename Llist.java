public class Llist {
   
    Node1 head;
   Llist insertatbeg(Llist L1,int data){
    Node1 ptr=new Node1(data);
    if(head==null){
       head=ptr;
    }else{
        ptr.link=head;
        head=ptr;
    }
    return L1;

}
    Llist insertatLast(Llist L1,int data){
        Node1 ptr=new Node1(data);
        
        if(head==null){
            head=ptr;
        }else{
            Node1 temp=head;
            while(temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link=ptr;
        }
        return L1;
   }

    Llist delatBeg(Llist L1)
    {
        Node1 temp;
        if(head==null){
            System.out.println("empty");
        }
        else
        {
            temp=head;
            head=head.link;
            temp=null;
        }
        return L1;
    }

    Llist delatLast(Llist L1){
        Node1 temp,save=null;

        if(head==null){
            System.out.println("empty");
        }else{
            temp=head;
            while(temp.link!=null){
                save=temp;
                temp=temp.link;
            }
           save.link=null;
            temp=null;
        }
        return L1;
    }

    Llist delatPos(Llist L1,int pos)
       
       {
    	 boolean flag=false;
    	   if(head==null)
    	   {
    		   System.out.println("under flow");
    	   }
    	   else
    	   {
    		   int i=1;
    		   Node1 temp=head,save=null;
    		   
    		   while(temp.link!=null)
    		   {
    			   
    			   if(i==pos)
    			   {
    				   save.link=temp.link;
    	    		   temp=null;
    	 		   
    				   
    				   flag=true;
    				   break;
    				   
    			   }
    			   
    			   
    			   save=temp;
    			   temp=temp.link;
    			   i++;
    		   }

               if(flag==true)
               {
            	   System.out.println("Deleted");
               }
               else
               {
            	   System.out.println("not removed...");
               }
    	   }
    	   
    	   return L1;
       
    }

     void show(Llist L1)
     { Node1 temp;
        int c=0;
    	 for(temp=head;temp!=null;temp=temp.link)
    	 {
    		 temp.show();
             c++;
    	 }
         System.out.println("number of element "+ c);
    	 
     }
     
     

    public static void main(String[]args){
        Llist m = new Llist();
     m=m.insertatLast(m, 0);
	 
     m=m.insertatLast(m, 2);
     m=m.insertatLast(m, 5);
     m=m.insertatLast(m, 7);
     m=m.insertatLast(m, 9);
     m=m.insertatLast(m, 3);
     m=m.insertatLast(m, 4);
     m=m.insertatbeg(m, 10);
	  m.show(m);
	  System.out.println("\n");
    //m=m.delatBeg(m);
     m=m.delatLast(m);
	 //m=m.delatPos(m,2 );
     m.show(m);
    }

}
