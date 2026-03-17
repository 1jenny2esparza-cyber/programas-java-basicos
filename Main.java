/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Ingresa la base del rectangulo: ");
        base = entrada.nextDouble();

        System.out.print("Ingresa la altura del rectangulo: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("El area del rectangulo es: " + area);
    }
}