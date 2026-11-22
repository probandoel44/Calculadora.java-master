import java.util.Scanner;

public class Estudiante {
    String nombre;
    int edad;
    double promedio;

    public void leerDatos() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        edad = entrada.nextInt();

        System.out.print("Ingrese el promedio del estudiante: ");
        promedio = entrada.nextDouble();
    }

    public void mostrarRiesgo() {
        if (promedio < 3.0) {
            System.out.println("El estudiante " + nombre + " esta en riesgo academico.");
        } else {
            System.out.println("El estudiante " + nombre + " no esta en riesgo academico.");
        }
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante();

        est.leerDatos();
        est.mostrarRiesgo();
    }
}