package com.spring_boot_rock_paper_scissors.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import com.spring_boot_rock_paper_scissors.domain.Game;
import com.spring_boot_rock_paper_scissors.domain.Move;
import com.spring_boot_rock_paper_scissors.domain.Result;
import com.spring_boot_rock_paper_scissors.domain.ScoreBoard;
import com.spring_boot_rock_paper_scissors.service.GameService;

@SpringBootTest
@AutoConfigureMockMvc
public class GameControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GameService gameService;

    @Test
public void testPlay() throws Exception {
    Move playerMove = Move.ROCK;
    Move computerMove = Move.PAPER;
    Result result = Result.LOSE;
    ScoreBoard scoreBoard = new ScoreBoard();

    when(gameService.play(any(Move.class))).thenReturn(new Game(playerMove, computerMove, result, scoreBoard));

    mockMvc.perform(post("/game/play")
            .contentType(MediaType.APPLICATION_JSON)
            .content("\"ROCK\""))
            .andExpect(status().isOk());
}

@Test
public void testAutoPlay() throws Exception {
    Move playerMove = Move.ROCK;
    Move computerMove = Move.PAPER;
    Result result = Result.LOSE;
    ScoreBoard scoreBoard = new ScoreBoard();

    when(gameService.play()).thenReturn(new Game(playerMove, computerMove, result, scoreBoard));

    mockMvc.perform(post("/game/autoPlay")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
}
}