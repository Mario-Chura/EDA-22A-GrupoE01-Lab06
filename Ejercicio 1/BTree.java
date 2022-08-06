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

    // Nodos internos: solo usa clave y siguiente
	// Nodos externos: solo usa clave y valor
	private static class Entry {
		private Comparable key;
		private Object val;
		private Node next;     // helper field to iterate over array entries
		public Entry(Comparable key, Object val, Node next) {
			this.key  = key;
			this.val  = val;
			this.next = next;
		}
	}

    public BTree() {
		root = new Node(0);
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return n;
	}

	public int height() {
		return height;
	}

	public Value get(Key key) {
		if (key == null) throw new IllegalArgumentException("argument to get() is null");
		return search(root, key, height);
    }

    private Value search(Node x, Key key, int ht) {
		Entry[] children = x.children;

		// Nodo externo
		if (ht == 0) {
			for (int j = 0; j < x.m; j++) {
				if (eq(key, children[j].key)) return (Value) children[j].val;
			}
		}

		// Nodo interno
		else {
			for (int j = 0; j < x.m; j++) {
				if (j+1 == x.m || less(key, children[j+1].key))
					return search(children[j].next, key, ht-1);
			}
		}
		return null;
	}

    //Inserta el par clave-valor en la tabla de símbolos, sobrescribiendo el valor antiguo con el valor nuevo si la clave ya está en la tabla de símbolos.
	//Si el valor es {@code null}, esto elimina efectivamente la clave de la tabla de símbolos
	
	public void put(Key key, Value val) {
		if (key == null) throw new IllegalArgumentException("argument key to put() is null");
		Node u = insert(root, key, val, height); 
		n++;
		if (u == null) return;

		// need to split root
		Node t = new Node(2);
		t.children[0] = new Entry(root.children[0].key, null, root);
		t.children[1] = new Entry(u.children[0].key, null, u);
		root = t;
		height++;
	}

}