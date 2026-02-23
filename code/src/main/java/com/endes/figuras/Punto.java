package com.endes.figuras;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
		
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
		
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distancia(Punto otro) {
		double dx = this.x - otro.x;
		double dy = this.y - otro.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	public void rotar(double angulo) {
		double radianes = Math.toRadians(angulo);
		double cos = Math.cos(radianes);
		double sin = Math.sin(radianes);
		
		double nuevoX = x * cos - y * sin;
		double nuevoY = x * sin + y * cos;
		
		this.x = nuevoX;
		this.y = nuevoY;
		
	}
	public void trasladar(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Punto otro = (Punto) obj;
		return Double.compare(x, otro.x) == 0 && Double.compare(y, otro.y) == 0;
	}
	public int hashCode() {
		return Double.hashCode(x) * 31 + Double.hashCode(y);
	}
	public Punto clone() {
		return new Punto(x, y);
	}
	public double distanciaAlOrigen() {
		return Math.sqrt(x * x + y * y);
	}
	public double anguloConElOrigen() {
		return Math.toDegrees(Math.atan2(y, x));
	}
	public Punto puntoMedio(Punto otro) {
		double medioX = (this.x + otro.x) / 2;
		double medioY = (this.y + otro.y) / 2;
		return new Punto(medioX, medioY);
	}
	public Punto puntoSimetrico() {
		return new Punto(-x, -y);
	}
	public Punto puntoRotado(double angulo) {
		double radianes = Math.toRadians(angulo);
		double cos = Math.cos(radianes);
		double sin = Math.sin(radianes);
		
		double nuevoX = x * cos - y * sin;
		double nuevoY = x * sin + y * cos;
		
		return new Punto(nuevoX, nuevoY);
	}
	public Punto puntoTrasladado(double dx, double dy) {
		return new Punto(x + dx, y + dy);
	}
	public boolean estaEnElEjeX() {
		return y == 0;
		
	}
	public boolean estaEnElEjeY() {
		return x == 0;
	}
}


