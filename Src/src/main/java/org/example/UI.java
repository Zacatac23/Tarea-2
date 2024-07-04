package org.example;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Programa FInalizado");
                break;
            }

            System.out.println("Ingrese el primer número:");
            int n1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número:");
            int n2 = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma: " + calc.suma(n1, n2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta: " + calc.resta(n1, n2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación: " + calc.multiplicacion(n1, n2));
                    break;
                default:
                    System.out.println("El resultado es");
            }
        }

        scanner.close();
    }
}
