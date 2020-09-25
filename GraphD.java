package TDAGrafo;

/**
 * Interface Graph - Estructura de Datos (DCIC-UNS).
 * Define los datos y operaciones aplicables sobre un grafo dirigido simple.
 * @author Estructuras de Datos, DCIC-UNS.
 * @param <V> Tipo de dato de los rótulos de los vértices.
 * @param <E> Tipo de dato de los rótulos de los arcos.
 */
public interface GraphD {
	/**
	 * Inserta un nuevo vértice con rótulo x.
	 * @param x rótulo del nuevo vértice
	 * @return Un nuevo vértice insertado.
	 */
	public void addNode(int node);
	
	/**
	 * Inserta un nuevo arco con rótulo e, desde un vértice v a un vértice w.
	 * @param v Un vértice
	 * @param w Un vértice
	 * @param e rótulo del nuevo arco.
	 * @return Un nuevo arco insertado desde un vértice V a un vértice W.
	 * @throws InvalidVertexException si uno de los vértices es inválido.
	 */
	public void addEdge(int node1, int node2);
	
	/**
	 * Remueve un vértice V y retorna su rótulo.
	 * @param v Un vértice
	 * @return rótulo de V.
	 * @throws InvalidVertexException si el vértice es inválido.
	 */
	public void removeNode(int node);
	
	/**
	 * Remueve un arco e y retorna su rótulo.
	 * @param e Un arco
 	 * @return rótulo de E.
	 * @throws InvalidEdgeException si el arco es inválido.
	 */
	public void removeEdge(int node1,int node2);
}
