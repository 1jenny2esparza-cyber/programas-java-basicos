import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        // IF / ELSE
        if (num > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo o cero");
        }

        // SWITCH
        switch (num) {
            case 1:
                System.out.println("Elegiste uno");
                break;
            case 2:
                System.out.println("Elegiste dos");
                break;
            default:
                System.out.println("Otro número");
        }
    }
}
