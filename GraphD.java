package TDAGrafo;

/**
 * Interface Graph - Estructura de Datos (DCIC-UNS).
 * Define los datos y operaciones aplicables sobre un grafo dirigido simple.
 * @author Estructuras de Datos, DCIC-UNS.
 * @param <V> Tipo de dato de los r�tulos de los v�rtices.
 * @param <E> Tipo de dato de los r�tulos de los arcos.
 */
public interface GraphD {
	/**
	 * Inserta un nuevo v�rtice con r�tulo x.
	 * @param x r�tulo del nuevo v�rtice
	 * @return Un nuevo v�rtice insertado.
	 */
	public void addNode(int node);
	
	/**
	 * Inserta un nuevo arco con r�tulo e, desde un v�rtice v a un v�rtice w.
	 * @param v Un v�rtice
	 * @param w Un v�rtice
	 * @param e r�tulo del nuevo arco.
	 * @return Un nuevo arco insertado desde un v�rtice V a un v�rtice W.
	 * @throws InvalidVertexException si uno de los v�rtices es inv�lido.
	 */
	public void addEdge(int node1, int node2);
	
	/**
	 * Remueve un v�rtice V y retorna su r�tulo.
	 * @param v Un v�rtice
	 * @return r�tulo de V.
	 * @throws InvalidVertexException si el v�rtice es inv�lido.
	 */
	public void removeNode(int node);
	
	/**
	 * Remueve un arco e y retorna su r�tulo.
	 * @param e Un arco
 	 * @return r�tulo de E.
	 * @throws InvalidEdgeException si el arco es inv�lido.
	 */
	public void removeEdge(int node1,int node2);
}
