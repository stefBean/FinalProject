package com.example.finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.example.finalproject.controller.GameController;


public class PacManGame extends Application {
    private GameController gameController;


    @Override
    public void start(Stage primaryStage) {
        gameController = new GameController();

        primaryStage.setTitle("P4C-ME");
        primaryStage.setScene(new Scene(gameController.getGameField(), 800, 600));

        gameController.startGame();

        primaryStage.show();

        // Set up key event handling
        primaryStage.getScene().setOnKeyPressed(event -> gameController.handleKeyPress(event.getCode()));
    }



    public static void main(String[] args) {
        launch();
    }
}