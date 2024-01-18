package com.spring_boot_rock_paper_scissors.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Game game;
    private Move playerMove;
    private Move computerMove;
    private Result result;
    private ScoreBoard scoreBoard;

    @BeforeEach
    public void setup() {
        playerMove = Move.ROCK;
        computerMove = Move.PAPER;
        result = Result.LOSE;
        scoreBoard = new ScoreBoard();
        game = new Game(playerMove, computerMove, result, scoreBoard);
    }

    @Test
    public void testGame() {
        assertEquals(playerMove, game.getPlayerMove());
        assertEquals(computerMove, game.getComputerMove());
        assertEquals(result, game.getResult());
        assertEquals(scoreBoard, game.getScoreBoard());
    }
}