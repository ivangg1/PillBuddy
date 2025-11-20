package com.SOFTWAREgrupoX.pillbuddy;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos (ej. 70.5): ");
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada no válida. Introduce tu peso en kg: ");
            sc.next();
        }
        double peso = sc.nextDouble();

        System.out.print("Introduce tu altura en metros (ej. 1.75): ");
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada no válida. Introduce tu altura en metros: ");
            sc.next();
        }
        double altura = sc.nextDouble();

        if (altura <= 0) {
            System.out.println("Altura debe ser mayor que cero.");
            sc.close();
            return;
        }

        double imc = calcularIMC(peso, altura);
        System.out.printf("Tu IMC es: %.2f%n", imc);
        System.out.println("Clasificación: " + clasificarIMC(imc));

        sc.close();
    }

    public static double calcularIMC(double pesoKg, double alturaM) {
        return pesoKg / (alturaM * alturaM);
    }

    public static String clasificarIMC(double imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 25) return "Normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidad";
    }
}
