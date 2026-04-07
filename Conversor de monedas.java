import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pesos, resultado = 0;
        int opcion;

        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        pesos = sc.nextDouble();

        System.out.println("\nSelecciona la moneda a convertir:");
        System.out.println("1. Dólar estadounidense (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Baht tailandés (THB)");
        System.out.println("4. Yen japonés (JPY)");
        System.out.println("5. Won surcoreano (KRW)");
        System.out.println("6. Dólar australiano (AUD)");
        System.out.println("7. Sol peruano (PEN)");
        System.out.println("8. Dólar canadiense (CAD)");
        System.out.println("9. Bolívar venezolano (VES)");
        System.out.println("10. Peso argentino (ARS)");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                resultado = pesos * 0.056497;
                System.out.println("Equivalente en USD: " + resultado);
                break;
            case 2:
                resultado = pesos * 0.048713;
                System.out.println("Equivalente en EUR: " + resultado);
                break;
            case 3:
                resultado = pesos * 1.835905;
                System.out.println("Equivalente en THB: " + resultado);
                break;
            case 4:
                resultado = pesos * 9.015796;
                System.out.println("Equivalente en JPY: " + resultado);
                break;
            case 5:
                resultado = pesos * 84.582437;
                System.out.println("Equivalente en KRW: " + resultado);
                break;
            case 6:
                resultado = pesos * 0.080999;
                System.out.println("Equivalente en AUD: " + resultado);
                break;
            case 7:
                resultado = pesos * 0.193191;
                System.out.println("Equivalente en PEN: " + resultado);
                break;
            case 8:
                resultado = pesos * 0.078490;
                System.out.println("Equivalente en CAD: " + resultado);
                break;
            case 9:
                resultado = pesos * 26.640000;
                System.out.println("Equivalente en VES: " + resultado);
                break;
            case 10:
                resultado = pesos * 78.698201;
                System.out.println("Equivalente en ARS: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}