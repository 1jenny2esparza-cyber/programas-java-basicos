import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcion;

        // Solicitar tema al usuario
        System.out.print("Ingresa un artista, película o serie: ");
        opcion = sc.nextLine().toLowerCase();

        // Estructura switch
        switch (opcion) {
            case "taylor swift":
                System.out.println("Taylor Swift es una cantante estadounidense famosa por sus álbumes como 1989 y Midnights.");
                break;

            case "harry potter":
                System.out.println("Harry Potter es una saga de películas basada en los libros de J.K. Rowling sobre un joven mago.");
                break;

            case "stranger things":
                System.out.println("Stranger Things es una serie de Netflix que mezcla ciencia ficción y misterio.");
                break;

            case "bad bunny":
                System.out.println("Bad Bunny es un cantante de música urbana reconocido a nivel mundial.");
                break;

            case "avengers":
                System.out.println("Avengers es una saga de películas de Marvel que reúne a varios superhéroes.");
                break;

            default:
                System.out.println("Tema no disponible en el sistema.");
        }

        sc.close();
    }
}