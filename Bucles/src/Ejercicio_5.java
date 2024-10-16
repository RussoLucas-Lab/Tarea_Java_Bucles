//Ejercicio 5: Cálculo de horas extras
//Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
//Instrucciones:
//•	Pide al usuario ingresar el número de empleados.
//•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
//•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.


import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> empleados = new HashMap<>();

        String nombre;
        int horas;

        while(true){

            System.out.print("Ingrese el nombre del empleado o S para salir: ");

            nombre = sc.nextLine();
            nombre = nombre.toUpperCase();

            if (nombre.equals("S")){break;}

            {

                while(true) {
                    System.out.print("Ingrese las horas trabajados por " + nombre + ": ");
                    horas = sc.nextInt();
                    sc.nextLine();
                    if(horas>0){break;}
                    else {System.out.println("Hora negativa, intentelo de nuevo");}
                }
            }

            empleados.put(nombre, horas);
        }

        System.out.println("\nLista de empleados y sus horas de trabajo:");
        for (String emp : empleados.keySet()) {
            System.out.println(emp +" "+ empleados.get(emp));
        }

        System.out.println("\nEmpleados que trajaron horas extras:");
        for (String emp : empleados.keySet()) {
            int horas_extras = empleados.get(emp);
            if (horas_extras > 40) {

                horas_extras = horas_extras - 40;
                System.out.println("El empleado: " + emp + " tranajó " + horas_extras+ " horas extras");
            }
        }

    }
}
