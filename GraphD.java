package TDAGrafo;

/**
 * Interface Graph - Estructura de Datos (DCIC-UNS).
 * Define los datos y operaciones aplicables sobre un grafo dirigido simple.
 * @author Estructuras de Datos, DCIC-UNS.
 */
public interface GraphD {
	/**
	 * Inserta un nuevo v�rtice con r�tulo node.
	 * @param node r�tulo del nuevo v�rtice
	 */
	public void addNode(int node);
	
	/**
	 * Inserta un nuevo arco desde un v�rtice node1 a un v�rtice node2.
	 * @param node1 Un v�rtice
	 * @param node2 Un v�rtice
	 */
	public void addEdge(int node1, int node2);
	
	/**
	 * Remueve un v�rtice node.
	 * @param node Un v�rtice
	 */
	public void removeNode(int node);
	
	/**
	 * Remueve el arco que va del vertice node1 al vertice node2.
	 * @param node1 un vertice.
	 * @param node2 un vertice.
	 */
	public void removeEdge(int node1,int node2);
}
