//Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
//Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
//Instrucciones:
//•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
//•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.


import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float estudiar, ejercicio, leer, tiempo_libre;

        while(true) {
            System.out.print("Ingrese la cantidad de horas que ha estudiado hoy: ");
            estudiar = sc.nextFloat();
            if (estudiar > 0){
            break;} else {System.out.print("\nHora negativa, intentelo de nuevo: ");}
        }

        while(true) {
            System.out.print("\nIngrese la cantidad de horas que ha hecho ejercicio hoy: ");
            ejercicio = sc.nextFloat();
            if (ejercicio > 0){
                break;} else {System.out.print("\nHora negativa, intentelo de nuevo: ");}
        }

        while(true) {
            System.out.print("\nIngrese la cantidad de horas de lectura de hoy: ");
            leer = sc.nextFloat();
            if (leer > 0){
                break;} else {System.out.print("\nHora negativa, intentelo de nuevo: ");}
        }

        while(true) {
            System.out.print("\nIngrese la cantidad de horas que ha tenido de tiempo libre hoy: ");
            tiempo_libre = sc.nextFloat();
            if (tiempo_libre > 0){
                break;} else {System.out.print("\nHora negativa, intentelo de nuevo: ");}
        }

        System.out.print("\nUsted ha dedicado "+ (leer + estudiar) + "  hora/s de actividades academicas.");
        System.out.print("\nUsted ha dedicado "+ (ejercicio + tiempo_libre) + "  hora/s de actividades personales.");


    }
}
