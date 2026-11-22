package com.ua.gamestore.service.mapper;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;
import com.ua.gamestore.web.dto.GameRequest;
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

  public Game toDomain(GameRequest request) {
    return new Game(
        null,
        request.title(),
        request.developer(),
        request.platform(),
        request.genre(),
        request.releaseYear(),
        request.price(),
        request.coverUrl(),
        request.description());
  }
}
