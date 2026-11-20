package com.ua.gamestore.web;

import com.ua.gamestore.service.GameService;
import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/games")
public class GameController {

  private final GameService gameService;

  @GetMapping
  public List<GameCardDto> list() {
    return gameService.findAll();
  }

  @GetMapping("/{id}")
  public GameDetailDto getOne(@PathVariable Long id) {
    return gameService.findById(id);
  }
}
