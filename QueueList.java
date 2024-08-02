import java.util.Queue;

public class QueueList {
    Node front,rear;	
	
	void add(QueueList lint , int info)
	{
		
		Node ptr=new Node(info);
		if(front==null)
		{
			front=rear=ptr;
			
		}
		else
		{
			
			rear.link=ptr;
			rear=ptr;
			
			
		}
	}
	
	
	void remove(QueueList list)
	{
		Node temp;
		if(front==null)
		{
			System.out.println("empty");
		}
		else if(front==rear)
		{
			front=rear=null;
		}
		
		else
		{
			System.out.println(front.info);
			temp=front;
			front=front.link;
			temp=null;
		}
		
		
	}
	
	
	int size(QueueList list)
	{
		Node temp;
		int c=0;
		for(temp=front;temp.link!=rear;temp=temp.link)
		{c++;
		
		}
		return c;
	}
	
	
	
	
	public static void main(String agrs[])

	{
        QueueList  m= new QueueList();
		m.add(m, 1);
		m.add(m, 2);
		m.add(m, 3);
		m.add(m, 4);
		m.add(m, 5);
		m.add(m, 6);
		m.add(m, 7);
		m.add(m, 8);
		m.remove(m);
		
        while(m.size(m)>0)
		m.remove(m);
		
	}
	


}

