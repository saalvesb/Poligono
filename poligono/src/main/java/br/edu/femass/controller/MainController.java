package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonActionQuadrado(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Quadrado.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setTitle("Quadrado");
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void handleButtonActionRetangulo(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Retangulo.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setTitle("Retangulo");
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
