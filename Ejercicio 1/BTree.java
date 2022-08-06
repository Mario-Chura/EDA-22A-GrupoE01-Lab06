public class BTree<Key extends Comparable<Key>, Value>  {	
	// Hijos máximos por nodo de árbol B = M-1
	// Debe ser par y mayor que 2
	private static final int M = 4;

	private Node root;       // raiz del arbol B
	private int height;      // altura del arbol B
	private int n;           // Numero de los pares clave-valor del arbol B

    // Tipo de dato del nodo auxiliar del arbol B
	private static final class Node {
		private int m;                             // Numero de hijos
		private Entry[] children = new Entry[M];   // Array de hijos

		// Creamos un nodo con "K" hijos
		private Node(int k) {
			m = k;
		}
	}

}