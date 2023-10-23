package com.spring_boot_rock_paper_scissors.domain;

public class HumanPlayer implements Player {

    private String id;
    private String name;
    private Move move;
    private int points = 0;

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void increasePoints() {
        points += 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public Move getMove() {
        return move;
    }
}
