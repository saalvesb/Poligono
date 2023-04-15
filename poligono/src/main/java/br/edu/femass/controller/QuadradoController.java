package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

//import javax.swing.Action;

import br.edu.femass.model.Quadrado;
import br.edu.femass.model.Reta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class QuadradoController implements Initializable {

  @FXML
  private TextField TxtX1;

  @FXML
  private TextField TxtY1;

  @FXML
  private TextField TxtX2;

  @FXML
  private TextField TxtY2;

  @FXML
  private TextField TxtArea;

  @FXML
  private TextField TxtPerimetro;

  @FXML
  private void BtnCalcular_click(ActionEvent action) {
    try {
      Double x1 = Double.parseDouble(TxtX1.getText());
      Double y1 = Double.parseDouble(TxtY1.getText());
      Double x2 = Double.parseDouble(TxtX2.getText());
      Double y2 = Double.parseDouble(TxtY2.getText());

      Quadrado q = new Quadrado(
          new Reta(x1, y1, x2, y2));

      TxtArea.setText(
          q.getArea().toString());

      TxtPerimetro.setText(
          q.getPerimetro().toString());

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
