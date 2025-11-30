// ArrayListEjemplo.java
package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEjemplo {

    public static void main(String[] args) {
        // Creamos una lista dinámica de productos
        ArrayList<Producto> productos = new ArrayList<>();

        // 1. Agregar productos
        productos.add(new Producto("Leche", 1.5, 10));
        productos.add(new Producto("Pan", 0.8, 20));
        productos.add(new Producto("Huevos", 2.5, 12));
        productos.add(new Producto("Queso", 3.0, 5));

        System.out.println("Lista inicial de productos:");
        listar(productos);

        // 2. Obtener tamaño
        System.out.println("Cantidad de productos: " + productos.size());

        // 3. Comprobar si está vacía
        System.out.println("¿La lista está vacía? " + productos.isEmpty());

        // 4. Obtener un elemento
        System.out.println("Primer producto: " + productos.get(0));

        // 5. Modificar un producto
        productos.get(1).setPrecio(1.0); // cambiar precio del pan
        System.out.println("Después de modificar el precio del pan:");
        listar(productos);

        // 6. Eliminar un producto
        productos.remove(3); // elimina Queso
        System.out.println("Después de eliminar Queso:");
        listar(productos);

        // 7. Buscar un producto
        System.out.println("¿Contiene Pan? " +
                productos.stream().anyMatch(p -> p.getNombre().equals("Pan")));

        // 8. Iterar con Iterator
        System.out.println("Iterando con Iterator:");
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            System.out.println(p);
        }

        // 9. Convertir ArrayList a array
        Producto[] arrayProductos = new Producto[productos.size()];
        productos.toArray(arrayProductos);
        System.out.println("Array de productos:");
        for (Producto p : arrayProductos) {
            System.out.println(p);
        }

        // 10. Ordenar productos por precio ascendente
        productos.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        System.out.println("Productos ordenados por precio ascendente:");
        listar(productos);

        // 11. Ordenar productos por precio descendente
        productos.sort((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()));
        System.out.println("Productos ordenados por precio descendente:");
        listar(productos);
    }

    // Método para listar productos
    public static void listar(ArrayList<Producto> lista) {
        for (Producto p : lista) {
            System.out.println(p);
        }
        System.out.println("------------------------------------------------");
    }
}
