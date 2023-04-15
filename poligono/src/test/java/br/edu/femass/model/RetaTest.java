package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetaTest {
  @Test
  void testgetTamanhoComPonto() {
    Ponto p1 = new Ponto();
    Ponto p2 = new Ponto(0.0, 5.0);
    Reta r = new Reta(p1, p2);

    assertEquals(5.0, r.getTamanho());
  }

  @Test
  void testgetTamanhoComCoordenadas() {
    Reta r = new Reta(0.0, 0.0, 0.0, 5.0);

    assertEquals(5.0, r.getTamanho());
  }
}
