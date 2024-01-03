package com.example.finalproject.view;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameField extends Pane {
    //PacMan Field
    public GameField() {
        Rectangle background = new Rectangle(800, 600, Color.BLACK);
        getChildren().add(background);
    }
}
