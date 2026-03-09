package com.endes.figuras;
/**
 * Clase abstracta que representa una figura geométrica genérica.
 * Todas las figuras geométricas deben extender esta clase e implementar
 * los métodos abstractos de cálculo de área y perímetro.
 * 
 * Implementa {@link Comparable} para proporcionar un orden natural basado en el área.
 * 
 * @author Daniela López
 * @version 1.0
 * @since 1.8 
 */
/*Clase que representa un triángulo, extiende la clase abstracta FiguraGeometrica*/
public class Triangulo extends FiguraGeometrica {

	    private Punto vertice1;
	    private Punto vertice2;
	    private Punto vertice3;

 /*Constructor de la clase triángulo*/ 
	public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
        super(nombre, color); 
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
    }

/*Calcula el area del triángulo*/
	    public double area() {
	        double x1 = vertice1.getX();
	        double y1 = vertice1.getY();
	        double x2 = vertice2.getX();
	        double y2 = vertice2.getY();
	        double x3 = vertice3.getX();
	        double y3 = vertice3.getY();

	        return Math.abs(
	                (x1 * (y2 - y3) +
	                 x2 * (y3 - y1) +
	                 x3 * (y1 - y2)) / 2.0
	        );
	    }
/*Calcula el perimetro del triángulo*/
	    public double perimetro() {
	        double lado1 = vertice1.distancia(vertice2);
	        double lado2 = vertice2.distancia(vertice3);
	        double lado3 = vertice3.distancia(vertice1);

	        return lado1 + lado2 + lado3;
	    }
/*Rota el triángulo un ángulo dado en grados*/
	    public void rotar(double angulo) {
	        vertice1.rotar(angulo);
	        vertice2.rotar(angulo);
	        vertice3.rotar(angulo);
	    }
/*Traslada el triángulo una distancia dada en x e y*/
	    public void trasladar(double dx, double dy) {
	        vertice1.trasladar(dx, dy);
	        vertice2.trasladar(dx, dy);
	        vertice3.trasladar(dx, dy);
	    }
	}


