package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrianguloTest {

@BeforeEach
void setUp() throws Exception {
   Punto v1 = new Punto(0, 0);
   Punto v2 = new Punto(4, 0);
   Punto v3 = new Punto(0, 3);
   Triangulo t = new Triangulo("Triángulo de prueba", "Rojo", v1, v2, v3);
}

@Test
    public void testArea() {
        // Crear tres puntos que forman un triángulo
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(0, 3);
       
        // Crear el triángulo
        Triangulo t = new Triangulo("Triángulo 1", "Rojo", p1, p2, p3);
       
        // Calcular el área (0.5 * base * altura)
        double areaCalculada = t.area();
       
        // Área esperada: 0.5 * 4 * 3 = 6
        double areaEsperada = 6.0;
       
        // Verificar que el área calculada es correcta
        assertEquals(areaEsperada, areaCalculada, 0.0001);
    }

    @Test
    public void testPerimetro() {
        // Crear tres puntos que forman un triángulo
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);
       
        // Crear el triángulo
        Triangulo t = new Triangulo("Triángulo 2", "Verde", p1, p2, p3);
       
        // Calcular el perímetro (usando la distancia entre los puntos)
        double perimetroCalculado = t.perimetro();
       
        // El perímetro esperado es:
        // distancia(p1, p2) + distancia(p2, p3) + distancia(p3, p1)
        double lado1 = p1.distancia(p2); // 3
        double lado2 = p2.distancia(p3); // 5
        double lado3 = p3.distancia(p1); // 4
        double perimetroEsperado = lado1 + lado2 + lado3; // 3 + 5 + 4 = 12
       
        // Verificar que el perímetro calculado es correcto
        assertEquals(perimetroEsperado, perimetroCalculado, 0.0001);
    }
   
    @Test
    public void testTrasladar() {
        // Crear tres puntos que forman un triángulo
        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(4, 1);
        Punto p3 = new Punto(1, 5);
       
        // Crear el triángulo
        Triangulo t = new Triangulo("Triángulo 3", "Azul", p1, p2, p3);
       
        // Trasladar el triángulo
        t.trasladar(2, 3); // Debe mover el triángulo en el plano (2, 3)
       
        // Verificar las nuevas coordenadas de los vértices
        assertEquals(3.0, p1.getX(), 0.0001); // p1 debe ir a (3, 4)
        assertEquals(4.0, p1.getY(), 0.0001);
       
        assertEquals(6.0, p2.getX(), 0.0001); // p2 debe ir a (6, 4)
        assertEquals(4.0, p2.getY(), 0.0001);
       
        assertEquals(3.0, p3.getX(), 0.0001); // p3 debe ir a (3, 8)
        assertEquals(8.0, p3.getY(), 0.0001);
    }
   
    @Test
    public void testRotar() {
        // Crear tres puntos que forman un triángulo
        Punto p1 = new Punto(1, 0);
        Punto p2 = new Punto(0, 1);
        Punto p3 = new Punto(-1, 0);
       
        // Crear el triángulo
        Triangulo t = new Triangulo("Triángulo 4", "Amarillo", p1, p2, p3);
       
        // Rotar el triángulo 90 grados
        t.rotar(90); // Rotación en sentido horario de 90 grados
       
        // Verificar las nuevas coordenadas después de la rotación
        assertEquals(0.0, p1.getX(), 0.0001); // (1, 0) debe ir a (0, 1)
        assertEquals(1.0, p1.getY(), 0.0001);
       
        assertEquals(-1.0, p2.getX(), 0.0001); // (0, 1) debe ir a (-1, 0)
        assertEquals(0.0, p2.getY(), 0.0001);
       
        assertEquals(0.0, p3.getX(), 0.0001); // (-1, 0) debe ir a (0, -1)
        assertEquals(-1.0, p3.getY(), 0.0001);
    }

}