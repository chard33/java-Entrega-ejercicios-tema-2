package com.ejercicioTema2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int precio = scanner.nextInt();

        System.out.println("El calculo del IVA es: " + calculoIVA(precio));
    }

    static double calculoIVA(double precio){

        return precio + precio * 0.16;
    }
}
