package com.endes.figuras;

/**
 * Clase cuadrado heredada de clase FiguraGeometrica, que representa un cuadrado con esquina y
 * lado específico.
 * 
 * @author Sara Nieves
 * @version 1.0
 * @since 1.8 
 */

public class Cuadrado extends FiguraGeometrica {
	Punto esquina;
	private double lado;
	
	/**
	 * Constructor de la clase Cuadrado.
	 * 
	 * @param nombre el nombre del cuadrado
	 * @param color el color del cuadrado
	 * @param lado la longitud del lado del cuadrado
	 * @param esquina la esquina del cuadrado
	 */
	
	public Cuadrado(String nombre, String color, double lado, Punto esquina) {
		super(nombre, color);
		this.lado=lado;
		this.esquina=esquina;
	}

	/**
	 * Calcula el área del cuadrado.
	 */
	
	@Override
	public double area() {
		System.out.println("Calculando el área del cuadrado " + getNombre() + ": " + lado*lado);
		return lado*lado;
	}

	/**
	 * Calcula el perímetro del cuadrado.
	 */
	
	@Override
	public double perimetro() {
		System.out.println("Calculando el perímetro del cuadrado " + getNombre() + ": "+ lado*4);
		return lado*4;
	}

	/**
	 * Rota el cuadrado en un ángulo específico (múltiplo de 90 grados).
	 * 
	 * @param angulo el ángulo de rotación en grados
	 */
	
	public void rotar(int angulo) {
		double anguloRad = Math.toRadians(angulo);

        double x = esquina.getX();
        double y = esquina.getY();

        double xNuevo = x * Math.cos(anguloRad) - y * Math.sin(anguloRad);
        double yNuevo = x * Math.sin(anguloRad) + y * Math.cos(anguloRad);

        esquina.setX(xNuevo);
        esquina.setY(yNuevo);
        System.out.println("Rotando el cuadrado " + getNombre() + " en " + angulo + " grados. Nueva posición de la esquina: (" + xNuevo + ", " + yNuevo + ").");
	}
	
	/**
	 * Traslada el cuadrado a una nueva posición especificada por dx y dy.
	 * 
	 * @param dx el desplazamiento en el eje x
	 * @param dy el desplazamiento en el eje y
	 */
	
	public void trasladar(double dx, double dy) {
		System.out.println("Trasladando el cuadrado " + getNombre() + " en (" + dx + ", " + dy + ").");
		esquina.setX(dx);
		esquina.setY(dy);
	}
	
}
