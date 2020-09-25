package TDAGrafo;

public class Arco{
protected int node1,node2;

	public Arco(int node1,int node2) {
		this.node1=node1;
		this.node2=node2;
	}

	public String toString() {
		return node1+","+node2;
	}
	
	
	
}
