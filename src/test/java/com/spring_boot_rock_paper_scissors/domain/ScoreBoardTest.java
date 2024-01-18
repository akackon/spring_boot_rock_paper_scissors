package com.spring_boot_rock_paper_scissors.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreBoardTest {

    @Test
    public void testScoreBoard() {
        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.playerWins();
        assertEquals(1, scoreBoard.getPlayerScore());
        assertEquals(0, scoreBoard.getComputerScore());

        scoreBoard.computerWins();
        assertEquals(1, scoreBoard.getPlayerScore());
        assertEquals(1, scoreBoard.getComputerScore());

        scoreBoard.reset();
        assertEquals(0, scoreBoard.getPlayerScore());
        assertEquals(0, scoreBoard.getComputerScore());
    }
}
