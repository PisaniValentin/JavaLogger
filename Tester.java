package TDAGrafo;

public class Tester {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		grafo.addNode(1);
		grafo.addNode(2);
		grafo.addNode(2);
		grafo.addNode(3);
		grafo.addEdge(1,2);
		grafo.addEdge(1,3);
		grafo.addEdge(1,3);
		grafo.addEdge(1,5);
		grafo.addEdge(10,2);
		grafo.removeNode(1);
		grafo.removeNode(1);
		grafo.addEdge(1,3);
		grafo.removeEdge(1, 2);



	}
}
