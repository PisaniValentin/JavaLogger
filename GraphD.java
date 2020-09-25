package TDAGrafo;

/**
 * Interface Graph - Estructura de Datos (DCIC-UNS).
 * Define los datos y operaciones aplicables sobre un grafo dirigido simple.
 * @author Estructuras de Datos, DCIC-UNS.
 */
public interface GraphD {
	/**
	 * Inserta un nuevo vértice con rótulo node.
	 * @param node rótulo del nuevo vértice
	 */
	public void addNode(int node);
	
	/**
	 * Inserta un nuevo arco desde un vértice node1 a un vértice node2.
	 * @param node1 Un vértice
	 * @param node2 Un vértice
	 */
	public void addEdge(int node1, int node2);
	
	/**
	 * Remueve un vértice node.
	 * @param node Un vértice
	 */
	public void removeNode(int node);
	
	/**
	 * Remueve el arco que va del vertice node1 al vertice node2.
	 * @param node1 un vertice.
	 * @param node2 un vertice.
	 */
	public void removeEdge(int node1,int node2);
}
