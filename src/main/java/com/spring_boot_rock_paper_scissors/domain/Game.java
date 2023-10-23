package com.spring_boot_rock_paper_scissors.domain;

public class Game {
    private int roundNumber;
    private Result result;


    public Result playGame(Player player1, Player player2) {


        return result;
    }

    public void awardPoint(Player player1, Player player2, Result result) {
        if (result == Result.P1_WINS) {
            player1.increasePoints();
        } else if (result == Result.P2_WINS) {
            player2.increasePoints();
        }
    }


}
