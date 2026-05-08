package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        Button button3 = new Button("Botón 3");
        button1.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-size: 20px;");
        button2.setStyle("-fx-background-color: green; -fx-text-fill: yellow; -fx-font-size: 10px;");
        button3.setStyle("-fx-background-color: black; -fx-text-fill: blue; -fx-font-size: 30px;");
        HBox hbox = new HBox(button1, button2);
        VBox vbox = new VBox(hbox, button3);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Ejemplo de Layouts en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
