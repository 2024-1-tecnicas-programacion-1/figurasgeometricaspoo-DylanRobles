package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
    
private double base;

private double altura;

public Rectangulo(String nombre, String color, double base, double altura){

    super(nombre, color);

    this.base = base;
    this.altura = altura;
}

public double obtenerArea(){

double area = base*altura;

return area;
}

public double obtenerPerimetro(){

    double perimetro = 2*(base+altura);

    return perimetro;
}


}
