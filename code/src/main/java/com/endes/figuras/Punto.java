package com.endes.figuras;

public class Punto {
	private double x;
	private double y;
	
	/**
	 * Constructor de la clase Punto.
	 * 
	 * @param x la coordenada x del punto
	 * @param y la coordenada y del punto
	 */
	
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Obtiene la coordenada x del punto.
	 * @return
	 */
	
	public double getX() {
		return x;
	}
	
	/**
	 * Obtiene la coordenada y del punto.
	 * @return
	 */
	
	public double getY() {
		return y;
	}

	/**
	 * Establece la coordenada x del punto.
	 * @param x la nueva coordenada x del punto
	 */
	
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Establece la coordenada y del punto.
	 * @param y la nueva coordenada y del punto
	 */
	
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Calcula la distancia entre este punto y otro punto dado.
	 * 
	 * @param otro el otro punto con el que se desea calcular la distancia
	 * @return la distancia entre los dos puntos
	 */
	
	public double distancia(Punto otro) {
		double dx = this.x - otro.x;
		double dy = this.y - otro.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

}
