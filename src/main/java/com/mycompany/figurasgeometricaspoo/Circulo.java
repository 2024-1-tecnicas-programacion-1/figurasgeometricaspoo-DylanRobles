package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {

private double radio;

public Circulo(String nombre, String color, double radio){

    super(nombre, color);

    this.radio = radio;
 
}

public double obtenerArea(){

double area = Math.PI * Math.pow(radio, 2); 
return area;
}


}
