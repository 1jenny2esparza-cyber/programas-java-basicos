import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio, descuento = 0, precioFinal;

        System.out.print("Ingresa el precio del producto: ");
        precio = sc.nextDouble();

        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
        } else {

            if (precio <= 100) {
                descuento = 0;
            } else if (precio <= 200) {
                descuento = 0.10;
            } else if (precio <= 500) {
                descuento = 0.20;
            } else {
                descuento = 0.25;
            }

            precioFinal = precio - (precio * descuento);

            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: $" + precioFinal);
        }

        sc.close();
    }
}