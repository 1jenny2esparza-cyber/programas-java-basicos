/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioBruto, porcentajeImpuestos, deducciones, impuesto, salarioNeto;

        System.out.print("Ingresa el salario bruto mensual: ");
        salarioBruto = entrada.nextDouble();

        System.out.print("Ingresa el porcentaje de impuestos: ");
        porcentajeImpuestos = entrada.nextDouble();

        System.out.print("Ingresa las deducciones adicionales: ");
        deducciones = entrada.nextDouble();

        impuesto = salarioBruto * (porcentajeImpuestos / 100);

        salarioNeto = salarioBruto - impuesto - deducciones;

        System.out.println("El salario neto es: " + salarioNeto);
    }
}
