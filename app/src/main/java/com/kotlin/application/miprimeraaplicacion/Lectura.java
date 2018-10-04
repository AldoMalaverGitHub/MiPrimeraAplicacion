package com.kotlin.application.miprimeraaplicacion;

import java.util.Scanner;

public class Lectura {

    public static void main(String [] args){
        System.out.println("Ingrese nombre:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        System.out.println(nombre);
    }
}
