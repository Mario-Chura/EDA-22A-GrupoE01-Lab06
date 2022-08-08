<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLE-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Arbol B</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>06</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>07/08/2022</td><td>HORA DE PRESENTACIÓN: 11:55 pm</td><td colspan="3"></td>
</tr>
<tr><td colspan="3">INTEGRANTE(s):
<ul>
      			<li><a href="https://github.com/fernandocoylaA">Fernando Jesús Coyla Alvarez</a></li>
			<li><a href="https://github.com/Icielo23">Valery Cielo Iquise Mamani</a></li>
			<li><a href="https://github.com/Mario-Chura">Mario Franco Chura Puma</a></li>
</ul>
</td>
<td>NOTA:</td><td colspan="2"></td>
</<tr>
<tr><td colspan="6">DOCENTE(s):
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tbody>
</table>
</div>
  

  
<div align="center"><h2> SOLUCIÓN Y RESULTADOS </h2></div>

### I.	SOLUCIÓN DE EJERCICIOS/PROBLEMAS
#
La estrutura del presente laboratorio es la siguiente:

   

   ```sh

	    ├── EDA-22A-GrupoE01-Lab06
	    │   ├── Ejercicio 1
	    │   │    ├── BTree.java
	    │   │    └── Prueba.java
	    │   │
	    │   ├── Ejercicio 2
	    │   │    └── Imagenes (Prodedimiento)
	    │   │
	    │   ├── Ejercicio 3
	    │   │    └── Imagenes (Prodedimiento)
	    │   │
	    │   ├── Ejercicio 4
	    │   │    └── Imagenes (Prodedimiento)
	    │   │
	    │   ├── Ejercicio 5
	    │   │    └── Imagenes (Prodedimiento)
	    │   │
	    └── README.md
   ```
    
1.  Ejercicio 1 : Modificar el método de obtención de valor dado una clave (5 puntos)
	- Ejemplo : Si en el código, para la clave www.simpsons.com, invocado de la siguiente manera:
	```py
		System.out.println("simpsons.com: " + st.get("wwwsimpsons.com")); 
   	```
	Retorna:
	```py
		simpsons.com: 209.052.165.60
   	```
	Para la clave "www.cs.princeton.edu", retorna:
	```py
		cs.princeton.edu: 128.112.136.12
   	```
	Se puede observar que se está obteniendo el valor de la primera clave encontrada. Dado que al árbol se le ingresan dos valores:
	```py
		st.put("www.cs.princeton.edu", "128.112.136.12"); 
		st.put("www.cs.princeton.edu", "128.112.136.11");
   	```
	Se requiere: Modificar el código para que también pueda mostrarse todos los valores asociados a la clave.
	- Procedimiento
2.  Ejercicio 2 : Mostrar en un diagrama de árbol gráficamente la estructura final para los datos
ingresados. (4 puntos)
	- Para el ingreso de datos vamos a trabajar con un árbol B de **grado 4** por lo que vamos a tener como máximo 3 valores y mínimo 1.
	- Los datos ingresados (clave - valor) del árbol B son los siguientes:
	```py
		st.put("www.cs.princeton.edu", "128.112.136.12");
		st.put("www.cs.princeton.edu", "128.112.136.11");
		st.put("www.princeton.edu",    "128.112.128.15");
		st.put("www.yale.edu",         "130.132.143.21");
		st.put("www.simpsons.com",     "209.052.165.60");
		st.put("www.apple.com",        "17.112.152.32");
		st.put("www.amazon.com",       "207.171.182.16");
		st.put("www.ebay.com",         "66.135.192.87");
		st.put("www.cnn.com",          "64.236.16.20");
		st.put("www.google.com",       "216.239.41.99");
		st.put("www.nytimes.com",      "199.239.136.200");
		st.put("www.microsoft.com",    "207.126.99.140");
		st.put("www.dell.com",         "143.166.224.230");
		st.put("www.slashdot.org",     "66.35.250.151");
		st.put("www.espn.com",         "199.181.135.201");
		st.put("www.weather.com",      "63.111.66.11");
		st.put("www.yahoo.com",        "216.109.118.65");
   	```
	- Primero empezamos agregando ("www.cs.princeton.edu", "128.112.136.12") y ("www.cs.princeton.edu", "128.112.136.11") y se posicionan de la siguiente manera:
	![imagen](Ejercicio 3/Img1.jpg)
3.  Ejercicio 3 : El método toString() del árbol, retorna lo siguiente. ¿Por qué están entre paréntesis
ciertas claves? (4 puntos)
	- Como salida del método toString tenemos lo siguiente:
	```py
		          www.amazon.com 207.171.182.16
		          www.apple.com 17.112.152.32
		          www.cnn.com 64.236.16.20
		     (www.cs.princeton.edu)
		          www.cs.princeton.edu 128.112.136.12
 		         www.cs.princeton.edu 128.112.136.11
		          www.dell.com 143.166.224.230
		(www.ebay.com)
		          www.ebay.com 66.135.192.87
		          www.espn.com 199.181.135.201
		          www.google.com 216.239.41.99
		     (www.microsoft.com)
		          www.microsoft.com 207.126.99.140
 		         www.nytimes.com 199.239.136.200
		(www.princeton.edu)
		          www.princeton.edu 128.112.128.15
		          www.simpsons.com 209.052.165.60
 		    (www.slashdot.org)
		          www.slashdot.org 66.35.250.151
 		         www.weather.com 63.111.66.11
 		    (www.yahoo.com)
 		         www.yahoo.com 216.109.118.65
		          www.yale.edu 130.132.143.21
   	```
	- Comentario:

Como se puede ver en la imagen las direcciones que presentan paréntesis en los costados son aquellas que se encuentran en niveles superiores diferentes al nivel hoja , por ejemplo el link (www.ebay.edu) al ser impreso se encuentra mas hacia la izquierda de las demas direcciones esto debido a que se encuentra en el nivel superior , osea en la raiz ,por otro lado el link microsoft.com tambien presenta parentesis pero se encuentra un poco mas a la derecha esto debido a q se encuentra en un nivel inferior al de la raiz pero distinto al de las hojas .

4.  Ejercicio 4 : Mostrar paso a paso el arbol-B al eliminar " www.espn.com": (4 puntos)
	- Procedimiento
4.  Ejercicio 5 : Agregar un nodo adicional (www.youtube.com, 134.24.13.78) y mostrarlo paso a
paso. (3 puntos)
	- Procedimiento
	
   
#

### II.	SOLUCIÓN DEL CUESTIONARIO


#

### III.	CONCLUSIONES
#
-La estructura de los arboles B nos permites que las operaciones de inserción, búsqueda y eliminación tenga una complejidad de orden O(log(n)). <br>
-Como podemos observar en el llenado de un árbol B cada nodo como mínimo esta a la mitad de su capacidad, es por ello que se dice que un árbol B mantiene una estructura “half-full”, no va haber nodos vacíos o menos de la mitad de su capacidad, la raíz es el unido que se exime de esa característica. <br>
-Los arboles b son buenos porque son muy eficientes al aplicarlos en dispositivos de almacenamientos secundarios. <br>
-Siempre que se realizan operaciones de eliminación e inserción el árbol permanece perfectamente balanceado.  <br>
-Que los arboles B suplen el uso excesivo de almacenamiento que presenta el arbol binario, por otro lado tambien brindan un mejor rendimiento en la velocidad de acceso a los datos. <br>
-Conclusion 6 <br>
-Conclusion 7 <br>
-Conclusion 8 <br>
-Conclusion 9 <br>
#
<div align="center"><h2>  RETROALIMENTACIÓN GENERAL </h2></div> <br>

<div align="center"><h2> REFERENCIAS Y BIBLIOGRAFÍA </h2></div> <br>

-   https://people.ksp.sk/~kuko/gnarley-trees/Btree.html
-   https://www.cs.usfca.edu/~galles/visualization/BTree.html
-   https://algs4.cs.princeton.edu/62btree/BTree.java.html
-   https://www.youtube.com/watch?v=kAzYAy6AJbg&t=236s&ab_channel=Prof.EdgarTista
