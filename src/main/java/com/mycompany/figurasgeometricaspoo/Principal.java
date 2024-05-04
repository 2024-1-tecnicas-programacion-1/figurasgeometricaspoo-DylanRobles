package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el nombre de la figura");
String nombre = sc.nextLine();
    System.out.println("Ingrese el color de la figura");
String color = sc.nextLine();
    System.out.println("Ingrese el tipo de figura");
    System.out.println("1 para circulo");
    System.out.println("2 para rectangulo");
    System.out.println("3 para triangulo");
    int tipo = sc.nextInt();
    switch (tipo){
    case 1:

    System.out.println("ingrese el radio del circulo");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(nombre, color, radio);

        circulo.obtenerArea();
        System.out.println(circulo.obtenerArea());
        circulo.obtenerPerimetro();
        System.out.println(circulo.obtenerPerimetro());


    break;
    case 2:
    System.out.println("ingrese la base del rectangulo");
        double base = sc.nextDouble();
    System.out.println("Ingrese la altura del rectangulo");
    double altura = sc.nextDouble();

    Rectangulo rectangulo = new Rectangulo(nombre, color, base, altura);

    rectangulo.obtenerArea();
    System.out.println(rectangulo.obtenerArea());
    rectangulo.obtenerPerimetro();
    System.out.println(rectangulo.obtenerPerimetro());



    break;
    case 3:

    System.out.println("Ingrese la base del triangulo");
    double base1 = sc.nextDouble();
    System.out.println("Ingrese la altura del triangulo");
    double altura1 = sc.nextDouble();
        Triangulo triangulo = new Triangulo(nombre, color, base1, altura1);
        triangulo.obtenerArea();
        System.out.println(triangulo.obtenerArea());
        triangulo.obtenerPerimetro();
        System.out.println(triangulo.obtenerPerimetro());


    break;

    default:

    break;

    }
    




    
}



}