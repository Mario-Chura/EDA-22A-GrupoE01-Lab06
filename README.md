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
	- Procedimiento
3.  Ejercicio 3 : El método toString() del árbol, retorna lo siguiente. ¿Por qué están entre paréntesis
ciertas claves? (4 puntos)
	- Procedimiento
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
-Conclusion 5 <br>
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
