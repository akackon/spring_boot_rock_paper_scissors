package com.spring_boot_rock_paper_scissors.controllers;

import com.spring_boot_rock_paper_scissors.domain.Game;
import com.spring_boot_rock_paper_scissors.domain.Move;
import com.spring_boot_rock_paper_scissors.service.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/play")
    public Game play(@RequestBody Move move) {
        return gameService.play(move);
    }

    @PostMapping("/autoPlay")
    public Game autoPlay() {
        return gameService.play();
    }

    @PostMapping("/newGame")
    public void newGame() {
        gameService.newGame();
    }
}