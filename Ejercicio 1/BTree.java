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
		private Node next;     // campo auxiliar para iterar sobre las entradas de la matriz
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
			System.out.println("Coincidencias para : "+key);
			for (int j = 0; j < x.m; j++) {
				if (eq(key, children[j].key)) System.out.println((Value) children[j].val);
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

    private Node insert(Node h, Key key, Value val, int ht) {
		int j;
		Entry t = new Entry(key, val, null);

		// Nodo externo
		if (ht == 0) {
			for (j = 0; j < h.m; j++) {
				if (less(key, h.children[j].key)) break;
			}
		}

		// Nodo interno
		else {
			for (j = 0; j < h.m; j++) {
				if ((j+1 == h.m) || less(key, h.children[j+1].key)) {
					Node u = insert(h.children[j++].next, key, val, ht-1);
					if (u == null) return null;
					t.key = u.children[0].key;
					t.val = null;
					t.next = u;
					break;
				}
			}
		}

		for (int i = h.m; i > j; i--)
			h.children[i] = h.children[i-1];
		h.children[j] = t;
		h.m++;
		if (h.m < M) return null;
		else         return split(h);
	}

    // Dividir el nodo por la mitad
	private Node split(Node h) {
		Node t = new Node(M/2);
		h.m = M/2;
		for (int j = 0; j < M/2; j++)
			t.children[j] = h.children[M/2+j]; 
		return t;    
	}

    // Repesentacion de la cadena del arbol B
	public String toString() {
		return toString(root, height, "") + "\n";
	}

	private String toString(Node h, int ht, String indent) {
		StringBuilder s = new StringBuilder();
		Entry[] children = h.children;

		if (ht == 0) {
			for (int j = 0; j < h.m; j++) {
				s.append(indent + children[j].key + " " + children[j].val + "\n");
			}
		}
		else {
			for (int j = 0; j < h.m; j++) {
				if (j > 0) s.append(indent + "(" + children[j].key + ")\n");
				s.append(toString(children[j].next, ht-1, indent + "     "));
			}
		}
		return s.toString();
	}

    // Funciones de comparación
	private boolean less(Comparable k1, Comparable k2) {
		return k1.compareTo(k2) < 0;
	}

	private boolean eq(Comparable k1, Comparable k2) {
		return k1.compareTo(k2) == 0;
	}

}