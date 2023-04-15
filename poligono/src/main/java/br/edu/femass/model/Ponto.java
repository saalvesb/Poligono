package br.edu.femass.model;

public class Ponto {
  private double x;
  private double y;

  public Ponto(Double x, Double y) {
    this.x = x;
    this.y = y;
  }

  public Ponto() {
    this.x = 0.0;
    this.y = 0.0;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String getLocalizacao() {
    if (this.x > 0.0 && this.y > 0.0)
      return "1o Quadrante";
    if (this.x < 0.0 && this.y > 0.0)
      return "2o Quadrante";
    if (this.x < 0.0 && this.y < 0.0)
      return "3o Quadrante";
    if (this.x > 0.0 && this.y < 0.0)
      return "4o Quadrante";
    if (this.x != 0.0 && this.y == 0.0)
      return "Eixo de X";
    if (this.x == 0.0 && this.y != 0.0)
      return "Eixo de Y";
    return "Origem";
  }

  public Double getDistancia(Ponto p) {
    return Math.sqrt(
        Math.pow(p.getX() - this.x, 2)
            + Math.pow(p.getY() - this.y, 2));
  }

  public Double getDistancia(Double x, Double y) {
    return this.getDistancia(
        new Ponto(x, y));
  }
}
