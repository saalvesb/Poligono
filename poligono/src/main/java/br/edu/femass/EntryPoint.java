package br.edu.femass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntryPoint extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    // Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Quadrado.fxml"));
    // Parent raiz =
    // FXMLLoader.load(getClass().getResource("/fxml/Retangulo.fxml"));
    Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));

    Scene scene = new Scene(raiz);
    stage.setTitle("Prog 3");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
