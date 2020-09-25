package TDAGrafo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.Filter;

public class Grafo implements GraphD {
	protected Map<Integer,Integer> nodos;
	protected Map<String,Arco> arcos;
	private static Logger logger;


	public Grafo() {
		nodos= new HashMap<Integer,Integer>();
		arcos=new HashMap<String,Arco>();
		if(logger==null) {
			logger = Logger.getLogger(Grafo.class.getName());
			Handler hnd = new ConsoleHandler();
			hnd.setLevel(Level.INFO);
			logger.addHandler(hnd);
			logger.setLevel(Level.WARNING);
			
			Logger rootLogger = logger.getParent();
			for (Handler h : rootLogger.getHandlers()){
				h.setLevel(Level.OFF);
			}
		}
	}

	@Override
	public void addNode(int node) {
		boolean estaNode = nodos.containsKey(node);
		if(!estaNode) {
			nodos.put(node, node);
			logger.info("Se ha agregado un nodo con rotulo: "+node);
		}else {
			logger.warning("El nodo ya: "+ node +" partenecia al grafo.");
		}
	}
	@Override
	public void addEdge(int node1, int node2){
		boolean estaArco=false;
		boolean estaNode1 = nodos.containsKey(node1);
		boolean estaNode2 = nodos.containsKey(node2);
		Arco arco = new Arco(node1,node2);
		String key = node1+","+node2;
		estaArco = arcos.containsKey(key);
		if(estaNode1 == false) {
			logger.warning("El nodo: "+node1+" no pertenece al grafo");
		}else {
			if(estaNode2 == false) {
				logger.warning("El nodo: "+node2+" no pertenece al grafo");
			}else {
				//si estan los 2 nodos y el arco no pertenece al grafo entonces lo agrego.
				if(!estaArco && estaNode1 && estaNode2) {
					arcos.put(key, arco);
					logger.info("Se ha agregado el arco de: "+arco);
				}else {
					logger.warning("El arco "+ key + " ya existia");
				}
			}
		}
	}

	@Override
	public void removeNode(int node){
		Map<String,Arco> mapeo_auxiliar=new HashMap<String,Arco>();
		String clave=null;
		String[] separar_palabras=null;
		boolean pertenece = nodos.containsKey(node);
		if(pertenece) {
			nodos.remove(node);
			logger.info("Se ha removido el nodo: "+node);
			for( Entry<String, Arco> p : arcos.entrySet()) {
				clave=p.getKey();
				separar_palabras=clave.split(",");
				if(separar_palabras[0].equals(Integer.toString(node)) || separar_palabras[1].equals(Integer.toString(node))) {
					mapeo_auxiliar.put(clave, p.getValue());
				} 
			}
			for(Entry<String,Arco> q: mapeo_auxiliar.entrySet()) {
				arcos.remove(q.getKey());
			}
		}else {
			logger.warning("El nodo: "+node+" no pertenece al grafo.");
		}
	}

	@Override
	public void removeEdge(int node1, int node2) {
		String key = node1+","+node2;
		boolean pertenece_arco=arcos.containsKey(key);
		if(pertenece_arco) {
			arcos.remove(key);
			logger.info("Se ha eliminado el arco: "+node1+","+node2);
		}else {
			logger.warning("El arco: "+ key +" no pertenece al grafo");
		}

		
	}
	
}