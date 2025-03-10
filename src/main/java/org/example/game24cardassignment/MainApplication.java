package org.example.game24cardassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("card-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 999, 522);
        scene.getStylesheets().add(MainApplication.class.getResource("mystyle.css").toExternalForm());
        stage.setTitle("Card Game - 24");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}