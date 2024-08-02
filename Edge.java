public class Edge {
    int src;
	int des;

	Edge()
	{
		
	}
	Edge(int src, int des)
	{
		this.src=src;
		this.des=des;
	}
	
	void show()
	{
		System.out.println(src+ " "+ des);
	}
}
