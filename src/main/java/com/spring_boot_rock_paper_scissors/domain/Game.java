package com.spring_boot_rock_paper_scissors.domain;

public class Game {
        private Move playerMove;
        private Move computerMove;
        private Result result;
        private ScoreBoard scoreBoard;
    
        // getters and setters
        public Move getPlayerMove() {
            return playerMove;
        }

        public void setPlayerMove(Move playerMove) {
            this.playerMove = playerMove;
        }

        public Move getComputerMove() {
            return computerMove;
        }

        public void setComputerMove(Move computerMove) {
            this.computerMove = computerMove;
        }

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public ScoreBoard getScoreBoard() {
            return scoreBoard;
        }

        public void setScoreBoard(ScoreBoard scoreBoard) {
            this.scoreBoard = scoreBoard;
        }

        // constructor
        public Game(Move playerMove, Move computerMove, Result result, ScoreBoard scoreBoard) {
            this.playerMove = playerMove;
            this.computerMove = computerMove;
            this.result = result;
            this.scoreBoard = scoreBoard;
        }    
    }