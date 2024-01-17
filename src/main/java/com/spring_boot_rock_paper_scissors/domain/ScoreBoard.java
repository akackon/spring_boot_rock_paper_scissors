package com.spring_boot_rock_paper_scissors.domain;

public class ScoreBoard {
        private int playerScore;
        private int computerScore;
    
        public void playerWins() {
            playerScore++;
        }
    
        public void computerWins() {
            computerScore++;
        }
    
        public void reset() {
            playerScore = 0;
            computerScore = 0;
        }

        
        // getters
        public int getPlayerScore() {
            return playerScore;
        }

        public int getComputerScore() {
            return computerScore;
        }

        // setters
        public void setPlayerScore(int playerScore) {
            this.playerScore = playerScore;
        }

        public void setComputerScore(int computerScore) {
            this.computerScore = computerScore;
        }
    }

