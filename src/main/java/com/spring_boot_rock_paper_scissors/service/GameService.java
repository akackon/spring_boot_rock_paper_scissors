package com.spring_boot_rock_paper_scissors.service;
import com.spring_boot_rock_paper_scissors.domain.Game;
import com.spring_boot_rock_paper_scissors.domain.Move;
import com.spring_boot_rock_paper_scissors.domain.Result;
import com.spring_boot_rock_paper_scissors.domain.ScoreBoard;
import org.springframework.stereotype.Service;
import java.util.Random;


@Service
public class GameService {
    private final Random random = new Random();
    private final ScoreBoard scoreBoard = new ScoreBoard();

    public Game play(Move playerMove) {
        Move computerMove = generateMove();
        Result result = determineWinner(playerMove, computerMove);
        updateScoreBoard(result);
        return new Game(playerMove, computerMove, result, scoreBoard);
    }

    public Game play() {
        Move computerMove1 = generateMove();
        Move computerMove2 = generateMove();
        Result result = determineWinner(computerMove1, computerMove2);
        updateScoreBoard(result);
        return new Game(computerMove1, computerMove2, result, scoreBoard);
    }

    public void newGame() {
        scoreBoard.reset();
    }

    private Move generateMove() {
        return Move.values()[random.nextInt(Move.values().length)];
    }

    private Result determineWinner(Move move1, Move move2) {
        // Implement game logic here
        if (move1 == move2) {
            return Result.DRAW;
        } else if (move1 == Move.ROCK && move2 == Move.SCISSORS) {
            return Result.WIN;
        } else if (move1 == Move.PAPER && move2 == Move.ROCK) {
            return Result.WIN;
        } else if (move1 == Move.SCISSORS && move2 == Move.PAPER) {
            return Result.WIN;
        } else {
            return Result.LOSE;
        }
    }

    private void updateScoreBoard(Result result) {
        if (result == Result.WIN) {
            scoreBoard.playerWins();
        } else if (result == Result.LOSE) {
            scoreBoard.computerWins();
        }
    }
}
    
