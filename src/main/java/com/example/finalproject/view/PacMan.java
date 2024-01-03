package com.example.finalproject.view;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PacMan extends Pane {
    //PacMan Figure
    public PacMan() {
        Circle pacMan = new Circle(25, Color.YELLOW);
        pacMan.setCenterX(50);
        pacMan.setCenterY(50);

        getChildren().add(pacMan);
    }
}

