package com.endes.figuras;

public class Circulo extends FiguraGeometrica {
    private Punto centro;
    private double radio;

    // Constructor
    public Circulo(String nombre, String color, Punto centro, double radio) {
        super(nombre, color);
        this.centro = centro;
        this.radio = radio;
    }

    // Métodos getters y setters
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación del método area
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    // Implementación del método perimetro
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    // Implementación del método rotar
    @Override
    public void rotar(double angulo) {
        // No se especifica comportamiento, por lo que no hace nada
    }

    // Implementación del método trasladar
    @Override
    public void trasladar(double dx, double dy) {
        centro.trasladar(dx, dy);
    }

    // Método compareTo para comparación de figuras
    @Override
    public int compareTo(FiguraGeometrica o) {
        if (o == null) {
            return 1;
        }

        if (o instanceof Circulo) {
            Circulo otroCirculo = (Circulo) o;
            if (this.radio < otroCirculo.radio) {
                return -1;
            } else if (this.radio > otroCirculo.radio) {
                return 1;
            }
            return 0;
        }
        return super.compareTo(o);
    }
}