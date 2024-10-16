import java.util.HashMap;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> inventario = new HashMap<>();

        String producto;
        int stock;

        while (true) {
            System.out.print("Ingrese el producto o S para salir: ");
            producto = sc.nextLine();
            producto = producto.toUpperCase();

            if (producto.equals("S")) {
                break;
            }

            System.out.print("Ingrese el stock de " + producto + ": ");
            try {
                stock = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para el stock.");
                sc.nextLine(); // Consumir el token inválido
                continue; // Volver al inicio del bucle
            }

            inventario.put(producto, stock);
            System.out.println("Producto: " + producto + " almacenado con stock: " + stock); // Impresión temporal
        }

        System.out.println("\nProductos con menos de 5 unidades en stock:");
        for (String productoKey : inventario.keySet()) {
            stock = inventario.get(productoKey);
            if (stock < 5) {
                System.out.println("Producto: " + productoKey + ", Stock: " + stock);
            }
        }

        sc.close();
    }
}