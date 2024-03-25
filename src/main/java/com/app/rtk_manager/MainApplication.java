package com.app.rtk_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/com/app/rtk_manager/RTK_Manager.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 895, 648);
            stage.setTitle("RTK Manager");
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


