import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("La persona es elegible para votar.");
        } else {
            System.out.println("La persona no es elegible para votar.");
        }

        sc.close();
    }
}
