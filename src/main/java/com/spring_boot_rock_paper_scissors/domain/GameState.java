package com.spring_boot_rock_paper_scissors.domain;

public class GameState {
    private String playerMove;
    private String computerMove;
    private String result;

    // getters and setters
    public String getPlayerMove() {
        return playerMove;
    }

    public void setPlayerMove(String playerMove) {
        this.playerMove = playerMove;
    }

    public String getComputerMove() {
        return computerMove;
    }

    public void setComputerMove(String computerMove) {
        this.computerMove = computerMove;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}