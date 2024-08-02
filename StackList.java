import java.util.Stack;

public class StackList {
    Node top;
	
	
	void push(StackList list,int info)
	{
	
		Node ptr=new Node(info);
		if(top==null)
		{
		  top=ptr;
		}
		else
		{
			ptr.link=top;
			top=ptr;
			
		}
			
		
		
	
	}
	
	void pop(StackList list)
	{
		Node temp;
		if(top==null)
		{
			System.out.println("under flow");
		}
		else
		{System.out.println(top.info);
			temp=top;
			top=top.link;
			temp=null;
		}
		
		
	}
	
	
	
	
	int size(StackList list)
	{Node temp;
	int c=0;
		for(temp=top;temp.link!=null;temp=temp.link)
		{
			c++;
		}
	return c;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		StackList sk=new StackList();
        sk.push(sk, 1);
        sk.push(sk, 91);
        sk.push(sk, 21);
        sk.push(sk, 14);
       
        while(sk.size(sk)>0)
	    sk.pop(sk);


       


	}

}
