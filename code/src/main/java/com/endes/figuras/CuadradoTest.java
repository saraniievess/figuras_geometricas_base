package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuadradoTest {

	@Test
	void test() {
		Cuadrado c1 = new Cuadrado("Cuadrado1", "Rojo", 4, new Punto(0,0));
		Cuadrado c2 = new Cuadrado("Cuadrado2", "Azul", 5, new Punto(1,1));
		
		assertEquals(16, c1.area());
		assertEquals(25, c2.area());
		
		assertEquals(16, c1.perimetro());
		assertEquals(20, c2.perimetro());
		
		c1.rotar(90);
		assertEquals(0, c1.esquina.getX());
		assertEquals(0, c1.esquina.getY());
		
		c2.rotar(180);
		assertEquals(-1, c2.esquina.getX(), 0.001);
		assertEquals(-1, c2.esquina.getY(), 0.001);
		
		c1.trasladar(2, 4);
		assertEquals(2, c1.esquina.getX());
		assertEquals(4, c1.esquina.getY());
		
		c2.trasladar(-1, -1);
		assertEquals(-1, c2.esquina.getX());
		assertEquals(-1, c2.esquina.getY());
		
	}

}
