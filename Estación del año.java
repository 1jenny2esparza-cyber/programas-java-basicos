import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        int mes;

        // Solicitar mes al usuario
        System.out.print("Ingresa el número del mes (1-12): ");
        mes = sc.nextInt();

        // Validación del rango
        if (mes < 1 || mes > 12) {
            System.out.println("Error: Mes no válido.");
        } else {

            // Determinar estación con switch
            switch (mes) {
                case 12:
                case 1:
                case 2:
                    System.out.println("La estación es: Invierno");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("La estación es: Primavera");
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.println("La estación es: Verano");
                    break;

                case 9:
                case 10:
                case 11:
                    System.out.println("La estación es: Otoño");
                    break;

                default:
                    System.out.println("Mes no válido.");
            }
        }

        // Cerrar Scanner
        sc.close();
    }
}