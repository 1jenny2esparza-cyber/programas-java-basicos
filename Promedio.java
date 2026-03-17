/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, promedio;

        System.out.print("Ingresa el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        num2 = entrada.nextDouble();

        System.out.print("Ingresa el tercer numero: ");
        num3 = entrada.nextDouble();

        promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio es: " + promedio);
    }
}