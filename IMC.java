/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Ingresa tu peso en kg: ");
        peso = entrada.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Tu IMC es: " + imc);
    }
}