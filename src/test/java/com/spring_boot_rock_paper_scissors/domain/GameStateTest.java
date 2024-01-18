package com.spring_boot_rock_paper_scissors.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GameStateTest {
    @Test
    public void testGameState() {
        GameState gameState = new GameState();
        String playerMove = "ROCK";
        String computerMove = "PAPER";
        String result = "LOSE";

        gameState.setPlayerMove(playerMove);
        gameState.setComputerMove(computerMove);
        gameState.setResult(result);

        assertEquals(playerMove, gameState.getPlayerMove());
        assertEquals(computerMove, gameState.getComputerMove());
        assertEquals(result, gameState.getResult());
    }
}
