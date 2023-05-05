package com.ejercicioTema2;

public class Main {

    public static void main(String[] args){

        System.out.println("El calculo del IVA es: " + calculoIVA(33));
    }

    static double calculoIVA(double precio){

        return precio + precio * 0.16;
    }
}
