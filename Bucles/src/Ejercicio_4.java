//Ejercicio 4: Registro de ventas diarias
//Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
//Instrucciones:
//•	Usa un bucle para registrar las ventas diarias durante 7 días.
//•	Al final del bucle, muestra el total de ventas de la semana.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> ventas = new HashMap<>();
        ArrayList<String> lista_dias = new ArrayList<>(Arrays.asList("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"));

        int venta_total=0;
        int venta;
        int i=1;

        do {
            System.out.print("Ingrese las ventas del día "+ lista_dias.get(i-1)+": ");

            venta = sc.nextInt();

            ventas.put(lista_dias.get(i-1),venta);

            venta_total = venta_total + venta;

            System.out.print("\n");
            ++i;
        }while (i<=7);

        for(String product : ventas.keySet()){

            System.out.println("EL dia " + product + " se vendio " + ventas.get(product));

        }

        System.out.println("\nEl total vendido en la semana fue de: " + venta_total);
    }
}
