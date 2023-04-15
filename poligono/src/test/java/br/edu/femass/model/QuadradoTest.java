package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuadradoTest {
  @Test
  void testgetArea() {
    Reta r = new Reta(0.0, 5.0, 0.0, 0.0);
    Quadrado q = new Quadrado(r);

    assertEquals(25.0, q.getArea());
  }

  @Test
  void testgetPerimetro() {
    Reta r = new Reta(0.0, 5.0, 0.0, 0.0);
    Quadrado q = new Quadrado(r);

    assertEquals(20.0, q.getPerimetro());
  }
}
