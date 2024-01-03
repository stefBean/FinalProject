package com.example.finalproject.controller;

import com.example.finalproject.structure.Pellet;
import com.example.finalproject.view.GameField;
import com.example.finalproject.view.PacMan;
import javafx.scene.Parent;
import javafx.scene.input.KeyCode;

public class GameController {
    private final PacMan pacMan;

    public GameController() {
        pacMan = new PacMan();
    }

    public void startGame() {
        // Implement game initialization
    }

    public GameField getGameField() {
        return new GameField();
    }

    public void handleKeyPress(KeyCode keyCode) {
        // Implement key press handling
    }
}

