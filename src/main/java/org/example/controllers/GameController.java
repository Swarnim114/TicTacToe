package org.example.controllers;

import org.example.exceptions.InvalidMoveException;
import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;

import java.util.List;

public class GameController {
    public static Game StartGame(int dimension, List<Player> players) {
        return new Game(dimension, players);    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}