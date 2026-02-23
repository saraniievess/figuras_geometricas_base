package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica {
	int esquina;
	double lado;
	
	public Cuadrado(String nombre, String color, double lado, int esquina) {
		super(nombre, color);
		this.lado=lado;
		this.esquina=esquina;
	}

	@Override
	public double area() {
		return lado*lado;
	}

	@Override
	public double perimetro() {
		return lado*4;
	}

	public void rotar(double angulo) {
		if (angulo%90==0) {
			esquina=(esquina+(int)(angulo/90))%4;
		} else {
			System.out.println("El ángulo de rotación debe ser un múltiplo de 90 grados.");
		}
	}
	
	public void trasladar(double dx, double dy) {
		System.out.println("Trasladando el cuadrado " + getNombre() + " en (" + dx + ", " + dy + ").");
	}
	
}
