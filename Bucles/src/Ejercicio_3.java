//Control de inventario
//Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
//Instrucciones:
//•	Pide al usuario ingresar el número de productos.
//•	Usa un bucle para ingresar la cantidad disponible de cada producto.
//•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> inventario = new HashMap<>();

        String producto;
        int stock;

        while(true){

            System.out.print("Ingrese el producto o S para salir: ");

            producto = sc.nextLine();
            producto = producto.toUpperCase();

            if (producto.equals("S")){break;}

            {

            while(true) {
                System.out.print("Ingrese el stock de " + producto + ": ");
                stock = sc.nextInt();
                sc.nextLine();
                if(stock>0){break;}
                else {System.out.println("Stock negativo, intentelo de nuevo");}
            }
            }

            inventario.put(producto, stock);
        }

        //Checkear los productos y su stock

        System.out.println("\nInventario de productos:");
        for (String product : inventario.keySet()) {
            System.out.println("Producto: " + product + ", Stock: " + inventario.get(product));
        }

        System.out.println("\nProductos con menos de 5 unidades en stock:");
        for (String product : inventario.keySet()) {
            stock = inventario.get(product);
            if (stock < 5) {
                System.out.println("Producto: " + product + ", Stock: " + stock);
            }
        }

    }
}
