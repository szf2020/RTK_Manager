package com.app.rtk_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("RTK_Manager.fxml"));
            stage.initStyle(StageStyle.TRANSPARENT);
            Scene scene = new Scene(fxmlLoader.load(), 470, 480);
            scene.setFill(Color.TRANSPARENT);
            //stage.setTitle("RTK Manager");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();  // Optional for detailed error information
        }
    }

    public static void main(String[] args) {
        launch();
    }
}


