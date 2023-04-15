package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PontoTest {

  @Test
  void testConstrutorVazio() {
    Ponto p = new Ponto();

    assertEquals(0.0, p.getX()); // espero receber 0 quando chamar o get
    assertEquals(0.0, p.getY());
  }

  @Test
  void testConstrutor() {
    Ponto p = new Ponto(2.5, 3.8);

    assertEquals(2.5, p.getX());
    assertEquals(3.8, p.getY());
  }

  @Test
  void testLocalizacao1Quadrante() {
    Ponto p = new Ponto(2.5, 3.8);
    String esperado = "1o Quadrante";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testLocalizacao2Quadrante() {
    Ponto p = new Ponto(-2.5, 3.8);
    String esperado = "2o Quadrante";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testLocalizacao3Quadrante() {
    Ponto p = new Ponto(-2.5, -3.8);
    String esperado = "3o Quadrante";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testLocalizacao4Quadrante() {
    Ponto p = new Ponto(2.5, -3.8);
    String esperado = "4o Quadrante";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testLocalizacaoEixoX() {
    Ponto p = new Ponto(2.5, 0.0);
    String esperado = "Eixo de X";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testLocalizacaoEixoY() {
    Ponto p = new Ponto(0.0, 3.0);
    String esperado = "Eixo de Y";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testLocalizacaoOrigem() {
    Ponto p = new Ponto(0.0, 0.0);
    String esperado = "Origem";
    assertEquals(esperado, p.getLocalizacao());
  }

  @Test
  void testgetDistanciaComPonto() {
    Ponto p1 = new Ponto();
    Ponto p2 = new Ponto(0.0, 5.0);
    Double esperado = 5.0;
    assertEquals(esperado, p1.getDistancia(p2));
  }

  @Test
  void testgetDistanciaComCoordenadas() {
    Ponto p1 = new Ponto();
    Double esperado = 5.0;
    assertEquals(esperado, p1.getDistancia(0.0, 5.0));
  }
}
