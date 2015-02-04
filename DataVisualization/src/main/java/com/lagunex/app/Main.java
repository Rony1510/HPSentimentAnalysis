/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagunex.app;

import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author carloshq
 */
public class Main extends Application {
    
    ResourceBundle i8n;
    
    @Override
    public void start(Stage stage) throws Exception {
        i8n = ResourceBundle.getBundle("com.lagunex.app.main");
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"),i8n);
        
        Scene scene = new Scene(root, 800, 600);
        
        stage.setTitle(i8n.getString("window.title"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}