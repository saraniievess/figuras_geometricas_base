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
	int esquina;
	double lado;
	
	/**
	 * Constructor de la clase Cuadrado.
	 * 
	 * @param nombre el nombre del cuadrado
	 * @param color el color del cuadrado
	 * @param lado la longitud del lado del cuadrado
	 * @param esquina la esquina del cuadrado (0 a 3)
	 */
	
	public Cuadrado(String nombre, String color, double lado, int esquina) {
		super(nombre, color);
		this.lado=lado;
		this.esquina=esquina;
	}

	/**
	 * Calcula el área del cuadrado.
	 */
	
	@Override
	public double area() {
		return lado*lado;
	}

	/**
	 * Calcula el perímetro del cuadrado.
	 */
	
	@Override
	public double perimetro() {
		return lado*4;
	}

	/**
	 * Rota el cuadrado en un ángulo específico (múltiplo de 90 grados).
	 * 
	 * @param angulo el ángulo de rotación en grados
	 */
	
	public void rotar(double angulo) {
		if (angulo%90==0) {
			esquina=(esquina+(int)(angulo/90))%4;
		} else {
			System.out.println("El ángulo de rotación debe ser un múltiplo de 90 grados.");
		}
	}
	
	/**
	 * Traslada el cuadrado a una nueva posición especificada por dx y dy.
	 * 
	 * @param dx el desplazamiento en el eje x
	 * @param dy el desplazamiento en el eje y
	 */
	
	public void trasladar(double dx, double dy) {
		System.out.println("Trasladando el cuadrado " + getNombre() + " en (" + dx + ", " + dy + ").");
	}
	
}
