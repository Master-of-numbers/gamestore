package com.ua.gamestore.service.mapper;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

  public GameCardDto toCard(Game game) {
    return new GameCardDto(
        game.getId(), game.getTitle(), game.getPlatform(), game.getPrice(), game.getCoverUrl());
  }

  public GameDetailDto toDetail(Game game) {
    return new GameDetailDto(
        game.getId(),
        game.getTitle(),
        game.getDeveloper(),
        game.getPlatform(),
        game.getGenre(),
        game.getReleaseYear(),
        game.getPrice(),
        game.getCoverUrl(),
        game.getDescription());
  }
}
