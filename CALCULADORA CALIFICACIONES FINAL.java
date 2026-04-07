import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double parciales, proyecto, examenFinal, calificacionFinal;

        // Entrada de datos
        System.out.print("Ingresa la calificación de parciales (0-100): ");
        parciales = sc.nextDouble();

        System.out.print("Ingresa la calificación del proyecto (0-100): ");
        proyecto = sc.nextDouble();

        System.out.print("Ingresa la calificación del examen final (0-100): ");
        examenFinal = sc.nextDouble();

        // Validación
        if (parciales < 0 || parciales > 100 ||
            proyecto < 0 || proyecto > 100 ||
            examenFinal < 0 || examenFinal > 100) {

            System.out.println("Error: Las calificaciones deben estar entre 0 y 100.");

        } else {
            // Cálculo
            calificacionFinal = (parciales * 0.40) +
                                (proyecto * 0.30) +
                                (examenFinal * 0.30);

            // Resultado
            System.out.println("La calificación final es: " + calificacionFinal);
        }

        sc.close();
    }
}