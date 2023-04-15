package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetanguloTest {
  @Test
  void testgetArea() {
    Reta l = new Reta(0.0, 0.0, 0.0, 5.0);
    Reta a = new Reta(6.0, 0.0, 0.0, 0.0);
    Retangulo r = new Retangulo(l, a);

    assertEquals(30.0, r.getArea());
  }

  @Test
  void testgetPerimetro() {
    Reta l = new Reta(0.0, 0.0, 0.0, 5.0);
    Reta a = new Reta(6.0, 0.0, 0.0, 0.0);
    Retangulo r = new Retangulo(l, a);

    assertEquals(22.0, r.getPerimetro());
  }

}
