package com.SOFTWAREgrupoX.pillbuddy;

import java.util.Scanner;

/**
 * Clase de utilidad para pedir dos números, mostrar su suma y devolver "hello world".
 */
public class SumHello {

    /** Devuelve el saludo solicitado. */
    public static String getHello() {
        return "hello world";
    }

    /**
     * Pide dos números por consola, muestra la suma y la devuelve.
     * Admite números con decimales.
     */
    public static void askAndSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada no válida. Ingrese un número: ");
            scanner.next();
        }
        double a = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada no válida. Ingrese un número: ");
            scanner.next();
        }
        double b = scanner.nextDouble();
        System.out.println(getHello());
        System.out.println("PillBuddy company");

    }

}
