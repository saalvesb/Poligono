package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.femass.model.Reta;
import br.edu.femass.model.Retangulo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class RetanguloController implements Initializable {

  @FXML
  private TextField TxtX1;

  @FXML
  private TextField TxtY1;

  @FXML
  private TextField TxtX2;

  @FXML
  private TextField TxtY2;

  @FXML
  private TextField TxtX3;

  @FXML
  private TextField TxtY3;

  @FXML
  private TextField TxtX4;

  @FXML
  private TextField TxtY4;

  @FXML
  private TextField TxtAreaR;

  @FXML
  private TextField TxtPerimetroR;

  @FXML
  private void BtnCalcularRet_click(ActionEvent action) {
    try {
      Double x1 = Double.parseDouble(TxtX1.getText());
      Double y1 = Double.parseDouble(TxtY1.getText());
      Double x2 = Double.parseDouble(TxtX2.getText());
      Double y2 = Double.parseDouble(TxtY2.getText());

      Double x3 = Double.parseDouble(TxtX3.getText());
      Double y3 = Double.parseDouble(TxtY3.getText());
      Double x4 = Double.parseDouble(TxtX4.getText());
      Double y4 = Double.parseDouble(TxtY4.getText());

      Reta l = new Reta(x1, y1, x2, y2);
      Reta a = new Reta(x3, y3, x4, y4);

      Retangulo r = new Retangulo(l, a);

      TxtAreaR.setText(
          r.getArea().toString());

      TxtPerimetroR.setText(
          r.getPerimetro().toString());

    } catch (NumberFormatException ne) {
      Alert alerta = new Alert(AlertType.ERROR);
      alerta.setTitle("Numero incorreto");
      alerta.show();
    }

  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
  }

}
