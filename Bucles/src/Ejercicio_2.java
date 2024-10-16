//Cálculo de salarios semanales
//Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
//Instrucciones:
//•	Pide al usuario ingresar la cantidad de empleados.
//•	Para cada empleado, pide ingresar las horas trabajadas.
//•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empleados, i,tarifa;


        ArrayList<Integer> id_empleado = new ArrayList<>();
        ArrayList<ArrayList<Float>> hora_empleado = new ArrayList<>();

        //Bucle para ingresar la cantidad de empleados
        while(true) {
            System.out.print("Ingrese la cantidad de empleados: ");
            empleados = sc.nextInt();
            if (empleados > 0){
                break;} else {System.out.print("\nCantidad negativa, intentelo de nuevo: ");}
        }

        //Bucle para asignar un id a cada empleado
        for(i=0; i <= empleados; i++) {
            id_empleado.add(i+1);
        }

        // Bucle para crear lista de lista con la hora de trabajo de cada empleado
        for (i = 0; i < empleados; i++) {
            hora_empleado.add(new ArrayList<Float>());
        }

        // Bucle para leer las horas de trabajo de cada empleado
        for(i=0; i < empleados; i++) {
            System.out.print("\nIngrese las horas trabajadas del empleado N°" + id_empleado.get(i) + ": ");
            float horas_trabajo = sc.nextFloat();
            hora_empleado.get(i).add(horas_trabajo);
        }

        //Bucle para corroborar datos
        for (i = 0; i <empleados; i++) {
            System.out.println("Horas trabajadas del empleado N°" + id_empleado.get(i) + ": " + hora_empleado.get(i));
        }

        //Bucle para ingresar la tarifa
        while(true) {
            System.out.print("Ingrese la tarifa por hora: ");
            tarifa = sc.nextInt();
            if (tarifa > 0){
                break;} else {System.out.print("\nCantidad negativa, intentelo de nuevo: ");}
        }


        //Calcular salario por empleado
        for(i=0; i<empleados; i++){

            float horas = hora_empleado.get(i).get(0);
            System.out.println("El salario del empleado N°" + id_empleado.get(i) + " es: " + horas* tarifa);
        }
    }
}
