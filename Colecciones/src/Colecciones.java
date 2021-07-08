import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * La coleccion Set no puede contener elementos duplicados
		 * Sólo tiene los métodos heredados de Collection
		 * Existen diferentes tipos de implementaciones

		 * HashSet
		 * TreeSet
		 * LinkedHashSet
		 * 
		 */
		
		/*
		 * HashSet: Esta implementación almacena los elementos en una 
		 * tabla hash. Es la que mejor rendimiento tiene.
		 * Los elementos no tienen un orden.
		 * 
		 */
		
		System.out.println("*************************");
		System.out.println("Implementación HashSet");
		System.out.println("*************************");
		
		Set<String> frutas = new HashSet();
		// el metodo add nos permite agregar elementos a la colección
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Mango");
		
		// recorremos los elementos de la colección
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
		/*
		 * TreeSet: Esta implementación almacena los elementos ordenandolos
		 * en función de sus valores. Es la que peor rendimiento tiene.
		 *  
		 */

		System.out.println("*************************");
		System.out.println("Implementación TreeSet");
		System.out.println("*************************");
		
		Set<String> frutas1 = new TreeSet();
		// el metodo add nos permite agregar elementos a la colección
		frutas1.add("Mango");
		frutas1.add("Manzana");
		frutas1.add("Durazno");
		frutas1.add("Pera");
		frutas1.add("Cereza");
		frutas1.add("Mandarina");
		frutas1.add("Carambola");
		frutas1.add("Maracuya");
		frutas1.add("Platano");
		frutas1.add("Mango");
		
		// recorremos los elementos de la colección
		for(String fruta: frutas1) {
			System.out.println(fruta);
		}
		
		//System.out.println(frutas.addAll(frutas));
		
		/*
		 * LinkedHashSet: Esta implementación almacena los elementos ordenandolos
		 * en función del orden de inserción.
		 *  
		 */

		System.out.println("*************************");
		System.out.println("Implementación LinkedHashSet");
		System.out.println("*************************");
		
		Set<String> frutas2 = new LinkedHashSet();
		// el metodo add nos permite agregar elementos a la colección
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");
		frutas2.add("Mango");
		
		// recorremos los elementos de la colección
		for(String fruta: frutas2) {
			System.out.println(fruta);
		}
		
		/*
		 * La interfaz List define una sucesión de elementos.
		 * Si admite elementos duplicados.
		 * Añade nuevos metodos que podemos usar
		 * Acceso posicional a elementos: manipula elementos en función de su posición en la lista.
		 * Búsqueda de elementos: busca un elemento concreto de la lista y devuelve su posición.
		 * Rango de operación: permite realizar ciertas operaciones sobre ragos de elementos dentro de la propia lista.
		 * 
		 * Implementaciones:
		 * ArrayList
		 * LinkedList
		 */
		
		/*
		 * ArrayList: esta es la implementación típica. Se basa en un array 
		 * redimensionable que aumenta su tamaño segun crece la colección de 
		 * elementos. Es la que mejor rendimiento tiene en la mayoria de 
		 * situaciones
		 *  
		 */
		
		System.out.println("*************************");
		System.out.println("Implementación ArrayList");
		System.out.println("*************************");
		List<String> frutas3 = new ArrayList<String>();
		// el metodo add nos permite agregar elementos a la colección
		frutas3.add("Mango");
		frutas3.add("Manzana");
		frutas3.add("Durazno");
		frutas3.add("Guayaba");
		frutas3.add("Pera");
		frutas3.add("Cereza");
		frutas3.add("Mandarina");
		frutas3.add("Carambola");
		frutas3.add("Maracuya");
		frutas3.add("Platano");
		frutas3.add("Mango");
		
		// recorremos los elementos de la colección
		for(String f: frutas3) {
			System.out.println(f);
		}
		
		// el método indexOf nos permite obtener la posición de un elemento del
		// arreglo. En caso de que el elemento no exista retorna -1
		int pera = frutas3.indexOf("Pera");
		System.out.println(pera);
		
		// el método get nos permite obtener un elemento en la posición 
		// especificada
		System.out.println(frutas3.get(pera));
		
		System.out.println("*************************");
		System.out.println("ArrayList de enteros");
		System.out.println("*************************");
		
		// List de enteros
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(456);
		agenda.add(123);
		agenda.add(789);
		
		// recorremos los elementos de la colección
		for(Integer a: agenda) {
			System.out.println(a);
		}
		
		/*
		 * ArrayList: esta implementación permite que mejore el rendimiento en 
		 * ciertas ocasiones. Se basa en una lista doblemente enlazada de los
		 * elementos, teniendo cada uno de los elementos un puntero al anterior
		 * y al siguiente elemento.
		 *  
		 */
		
		System.out.println("*************************");
		System.out.println("Implementación LinkedList");
		System.out.println("*************************");
		
		//LinkedList
		List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		
//		animales.add("Conejo");
		
		
		animales.add("Tortuga");	
		animales.add("Oso");
		animales.add("Quetzal");
		
		int oso = animales.indexOf("Oso");
		animales.add(oso, "Vaca");
		
		for(String an: animales) {
			System.out.println(an);
		}
		
		/*
		 * La interfaz Map asocia claves a valores.
		 * No puede contener claves duplicadas y cada
		 * clave solo puede tener asociado un valor
		 * 
		 * Implementaciones
		 * HashMap
		 * TreeMap
		 * LinkedHashMap
		 */
		
		/*
		 * Implementación HashMap
		 * Es la implementación con mejor rendimiento pero no garantiza
		 * ningun orden a la hora de realizar iteraciones
		 */
		
		System.out.println("*************************");
		System.out.println("Implementación HashMap");
		System.out.println("*************************");
		
		Map<String, String> diccionario = new HashMap<>();
		// diccionario.put(clave, valor);
		// el metodo put nos permite agregar pares de clave y valor a la colección
		diccionario.put("sdfsdf", "Carlos Eduardo");
		diccionario.put("sddsfds", "213123");
		diccionario.put("indice", "ewrwewe");
		
		// el metodo get nos permite recuperar el valor de un elemento ingresando
		// la llave
		//System.out.println(diccionario.get("sdfsdf"));
		
		// recorremos la colección
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		/*
		 * Implementación
		 * TreeMap
		 * Ordena los elemento de menor a mayor dependiendo de las claves
		 */
		
		System.out.println("*************************");
		System.out.println("Implementación TreeMap");
		System.out.println("*************************");
		
		Map<String, String> diccionario2 = new TreeMap<>();
		// diccionario.put(clave, valor);
		// el metodo put nos permite agregar pares de clave y valor a la colección
		diccionario2.put("sdfsdf", "Carlos Eduardo");
		diccionario2.put("sddsfds", "213123");
		diccionario2.put("indice", "ewrwewe");
			
		// recorremos la colección
		for (Map.Entry<String, String> entry : diccionario2.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		/*
		 * Implementación
		 * LinkedHashMap
		 * Ordena los elemento en orden de insersión
		 */
		
		System.out.println("*************************");
		System.out.println("Implementación LinkedHashMap");
		System.out.println("*************************");
		
		Map<String, String> diccionario3 = new LinkedHashMap<>();
		// diccionario.put(clave, valor);
		// el metodo put nos permite agregar pares de clave y valor a la colección
		diccionario3.put("sdfsdf", "Carlos Eduardo");
		diccionario3.put("sddsfds", "213123");
		diccionario3.put("indice", "ewrwewe");
		
		// recorremos la colección
		for (Map.Entry<String, String> entry : diccionario3.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
	}

	/*
	 * Código hecho y comentado con amor para el mejor grupo del bootcamp JAVA
	 * Fue un tema complicado chicas y chicos pero lograran entenderlo, 
	 * son super pro.
	 * Son las y los mejores, les quiero. 
	 */
}
