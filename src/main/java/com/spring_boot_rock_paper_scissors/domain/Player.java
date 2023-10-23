package com.spring_boot_rock_paper_scissors.domain;

public interface Player {

    void setMove(Move nextMove);

    Move getMove();

    void setPoints(int points);

    int getPoints();

    void increasePoints();


}
