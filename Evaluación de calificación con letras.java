import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        int calificacion;

        // Solicitar calificación al usuario
        System.out.print("Ingresa la calificación (0-100): ");
        calificacion = sc.nextInt();

        // Validación
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
        } else {

            // Asignación de letra
            if (calificacion >= 90) {
                System.out.println("Calificación: A");
            } else if (calificacion >= 80) {
                System.out.println("Calificación: B");
            } else if (calificacion >= 70) {
                System.out.println("Calificación: C");
            } else if (calificacion >= 60) {
                System.out.println("Calificación: D");
            } else {
                System.out.println("Calificación: F");
            }
        }

        // Cerrar Scanner
        sc.close();
    }
}