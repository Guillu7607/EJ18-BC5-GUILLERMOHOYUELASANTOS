package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Mostrar un mensaje");
        button.setOnAction(e -> {
                System.out.println("Mensaje 1");
        });
        Button button2 = new Button("Mostrar otro mensaje");
        button2.setOnAction(e -> {
            System.out.println("Mensaje 2");
        });
        Button button3 = new Button("Mostrar un último mensaje");
        button3.setOnAction(e -> {
            System.out.println("Mensaje 3");
        });

        VBox vbox = new VBox(10, button, button2, button3);
        Scene scene = new Scene(vbox, 300, 250);

        primaryStage.setTitle("Mostrar mensajes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
