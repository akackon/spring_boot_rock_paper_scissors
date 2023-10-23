package com.spring_boot_rock_paper_scissors.domain;

public class NPCPlayer implements Player {
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

    @Override
    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public Move getMove() {
        return move;
    }
}
