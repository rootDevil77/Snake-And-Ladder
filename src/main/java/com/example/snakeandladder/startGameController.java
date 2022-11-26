package com.example.snakeandladder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class startGameController {
    @FXML
    public void start(MouseEvent event) throws IOException {
        AnchorPane start;
        start = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
       com.example.snakeandladder.HelloApplication.root.getChildren().setAll(start);
    }
}