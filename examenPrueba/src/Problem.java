import java.util.ArrayList;
import java.util.Scanner;

public class Problem {

    //instanciando arrays a utilizar:
    ArrayList <String> empleados = new ArrayList<>();
    ArrayList <Double> sueldos  = new ArrayList<>();

    public Problem() {
        Scanner input = new Scanner(System.in);

        //pidiendo cantidad empleados:
        int cantidadEmpleados = 0;
        System.out.println("Ingresa la cantidad de empleados: ");
        cantidadEmpleados = input.nextInt();

        //llamando a la funcion:
        calculateEmpleados(input, cantidadEmpleados);

        //imprimiendo la estructura de datos:
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("\nRESULTADOS: \n");
            System.out.print(empleados.get(i) + " || ");
            System.out.println(sueldos.get(i));
        }
    }

    //funcion que realiza el procedimiento:
    private void calculateEmpleados(Scanner input, int cantidadEmpleados) {
        for (int i = 0; i < cantidadEmpleados; i++) {
            double newSueldoEmpleado = 0;

            System.out.println("Ingresa el nombre del empleado " + (i+1));
            String nombreEmpleado = input.next();

            System.out.println("Ingresa el sueldo del empleado " + nombreEmpleado);
            int sueldoEmpleado = input.nextInt();

            if (sueldoEmpleado >= 500000) {
                newSueldoEmpleado = (1.08*sueldoEmpleado);
            } else {
                newSueldoEmpleado = (1.1*sueldoEmpleado);
            }

            //imprimiendo el mensaje:
            System.out.println("Nombre empleado: " + nombreEmpleado);
            System.out.println("Sueldo actual: " + sueldoEmpleado);
            System.out.println("Sueldo nuevo: " + newSueldoEmpleado);
            System.out.println("Valor aumentado: " + (newSueldoEmpleado - sueldoEmpleado));
            //llenando el array:
            empleados.add(nombreEmpleado);
            sueldos.add(newSueldoEmpleado);
        }
    }
}
